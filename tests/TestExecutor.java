import com.sun.tools.javac.util.Context;
import org.jmlspecs.openjml.Factory;
import org.jmlspecs.openjml.IAPI;
import org.jmlspecs.openjml.JmlTree;
import org.jmlspecs.openjml.JmlTreeScanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jklamroth on 12/3/18.
 */
public class TestExecutor {
    static String[] fileNames = {"./tests/Test2.java"};
    static private File tmpFile = new File("./tests/tmp.java");

    public static void main(String[] args) throws IOException {
        for(String fileName : fileNames) {

            try {
                File f = new File(fileName);
                String translation = Main.translate(f);
                String name = f.getName().substring(0, f.getName().indexOf("."));
                translation = translation.replaceAll(name, name + "tmp");
                tmpFile = new File(f.getParent() + File.separator + name + "tmp.java");
                Files.write(tmpFile.toPath(), translation.getBytes(), StandardOpenOption.CREATE_NEW);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Runtime rt = Runtime.getRuntime();
            String[] commands = {"javac", "-cp", "./tests/", tmpFile.toPath().toString()};
            Process proc = rt.exec(commands);

            BufferedReader stdInput = new BufferedReader(new
                    InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                    InputStreamReader(proc.getErrorStream()));

            // read the output from the command
            String s = stdInput.readLine();
            if (s != null) {
                System.out.println("Error compiling file: " + tmpFile.toPath().toString());
                while (s != null) {
                    System.out.println(s);
                    s = stdInput.readLine();
                }
                return;
            }
            s = stdError.readLine();
            if (s != null) {
                System.out.println("Error compiling file: " + tmpFile.toPath().toString());
                while (s != null) {
                    System.out.println(s);
                    s = stdError.readLine();
                }
                return;
            }

            for(String function : FunctionNameVisitor.getFunctionNames(tmpFile.toPath().toString())) {

                //commands = new String[] {"jbmc", tmpFile.getAbsolutePath().replace(".java", ".class")};
                function = tmpFile.getName().replace(".java", ".") + function;
                String classFile = tmpFile.toPath().toString().replace(".java", ".class");
                commands = new String[]{"jbmc", classFile, "--function", function};
                proc = rt.exec(commands);

                stdInput = new BufferedReader(new
                        InputStreamReader(proc.getInputStream()));

                s = stdInput.readLine();
                if (s != null) {
                    System.out.println("JBMC Output for file: " + tmpFile.toPath().toString().replace(".java", ".class") + " with fucntion " + function);
                    while (s != null) {
                        if (s.contains("**") || s.contains("FAILURE") || s.contains("VERIFICATION")) {
                            System.out.println(s);
                        }
                        s = stdInput.readLine();
                    }
                }
            }

            commands = new String[]{"rm", tmpFile.toPath().toString().replace(".java", ".class")};
            proc = rt.exec(commands);

            commands = new String[]{"rm", tmpFile.toPath().toString().replace(".java", "$ReturnException.class")};
            proc = rt.exec(commands);

            commands = new String[]{"rm", tmpFile.toPath().toString()};
            proc = rt.exec(commands);
        }
    }
}

class FunctionNameVisitor extends JmlTreeScanner {
    public List<String> functionNames = new ArrayList();
    @Override
    public void visitJmlMethodDecl(JmlTree.JmlMethodDecl that) {
        functionNames.add(that.getName().toString());
    }

    static List<String> getFunctionNames(String fileName) {
        try {
            String[] args = {fileName};
            IAPI api = Factory.makeAPI();
            java.util.List<JmlTree.JmlCompilationUnit> cu = api.parseFiles(args);
            int a = api.typecheck(cu);
            //System.out.printf("a=%d", a);

            Context ctx = api.context();
            FunctionNameVisitor fnv = new FunctionNameVisitor();
            for (JmlTree.JmlCompilationUnit it : cu) {
                //System.out.println(api.prettyPrint(rewriteRAC(it, ctx)));
                ctx.dump();
                it.accept(fnv);
            }
            return fnv.functionNames;
        } catch (Exception e) {
            return new ArrayList<String>();
        }
    }
}
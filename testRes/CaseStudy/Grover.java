package Translations;

public class Grover {

  public Grover() {
    super();
  }
    /*@
      ensures ((val >= 0 && val < 4) ==> \result == val) && ((val < 0 || val > 3) ==> \result == -1);
   */

  public static int grover(int val) {
    if (val < 0 || val > 3) {
      return -1;
    }
    /*@ non_null */
    float[][] m = getOracle(val);
    float[][] q_state_0 = new float[][]{new float[]{1.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    float[][] q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F}, new float[]{0.0F}, new float[]{0.70710677F}, new float[]{0.0F}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.49999997F}, new float[]{0.49999997F}, new float[]{0.49999997F}, new float[]{0.49999997F}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]}, new float[]{0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]}, new float[]{0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3]}, new float[]{0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])}, new float[]{0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])}, new float[]{0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])}, new float[]{0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-1.0F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}, new float[]{-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    q_state_0 = new float[][]{new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))) + 0.70710677F * (-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))))}, new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))) + -0.70710677F * (-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + -0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))))}, new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))) + 0.70710677F * (-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))))}, new float[]{0.70710677F * (0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + 0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3])))) + -0.70710677F * (-0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + 0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + 0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))) + 0.70710677F * (0.70710677F * (0.70710677F * (0.49999997F * m[0][0] + 0.49999997F * m[0][1] + 0.49999997F * m[0][2] + 0.49999997F * m[0][3]) + -0.70710677F * (0.49999997F * m[2][0] + 0.49999997F * m[2][1] + 0.49999997F * m[2][2] + 0.49999997F * m[2][3])) + -0.70710677F * (0.70710677F * (0.49999997F * m[1][0] + 0.49999997F * m[1][1] + 0.49999997F * m[1][2] + 0.49999997F * m[1][3]) + -0.70710677F * (0.49999997F * m[3][0] + 0.49999997F * m[3][1] + 0.49999997F * m[3][2] + 0.49999997F * m[3][3]))))}};
    q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}, new float[]{0.0F}};
    boolean $$_tmp_measureVar1;
    if ((q_state_0[2][0] * q_state_0[2][0] + q_state_1[2][0] * q_state_1[2][0]) * (q_state_0[2][0] * q_state_0[2][0] + q_state_1[2][0] * q_state_1[2][0]) + (q_state_0[3][0] * q_state_0[3][0] + q_state_1[3][0] * q_state_1[3][0]) * (q_state_0[3][0] * q_state_0[3][0] + q_state_1[3][0] * q_state_1[3][0]) > (q_state_0[0][0] * q_state_0[0][0] + q_state_1[0][0] * q_state_1[0][0]) * (q_state_0[0][0] * q_state_0[0][0] + q_state_1[0][0] * q_state_1[0][0]) + (q_state_0[1][0] * q_state_0[1][0] + q_state_1[1][0] * q_state_1[1][0]) * (q_state_0[1][0] * q_state_0[1][0] + q_state_1[1][0] * q_state_1[1][0])) {
      q_state_0 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{q_state_0[2][0]}, new float[]{q_state_0[3][0]}};
      q_state_1 = new float[][]{new float[]{0.0F}, new float[]{0.0F}, new float[]{q_state_1[2][0]}, new float[]{q_state_1[3][0]}};
      $$_tmp_measureVar1 = true;
    } else {
      q_state_0 = new float[][]{new float[]{q_state_0[0][0]}, new float[]{q_state_0[1][0]}, new float[]{0.0F}, new float[]{0.0F}};
      q_state_1 = new float[][]{new float[]{q_state_1[0][0]}, new float[]{q_state_1[1][0]}, new float[]{0.0F}, new float[]{0.0F}};
      $$_tmp_measureVar1 = false;
    }
    boolean res1 = $$_tmp_measureVar1;
    boolean $$_tmp_measureVar2;
    if ((q_state_0[1][0] * q_state_0[1][0] + q_state_1[1][0] * q_state_1[1][0]) * (q_state_0[1][0] * q_state_0[1][0] + q_state_1[1][0] * q_state_1[1][0]) + (q_state_0[3][0] * q_state_0[3][0] + q_state_1[3][0] * q_state_1[3][0]) * (q_state_0[3][0] * q_state_0[3][0] + q_state_1[3][0] * q_state_1[3][0]) > (q_state_0[0][0] * q_state_0[0][0] + q_state_1[0][0] * q_state_1[0][0]) * (q_state_0[0][0] * q_state_0[0][0] + q_state_1[0][0] * q_state_1[0][0]) + (q_state_0[2][0] * q_state_0[2][0] + q_state_1[2][0] * q_state_1[2][0]) * (q_state_0[2][0] * q_state_0[2][0] + q_state_1[2][0] * q_state_1[2][0])) {
      q_state_0 = new float[][]{new float[]{0.0F}, new float[]{q_state_0[1][0]}, new float[]{0.0F}, new float[]{q_state_0[3][0]}};
      q_state_1 = new float[][]{new float[]{0.0F}, new float[]{q_state_1[1][0]}, new float[]{0.0F}, new float[]{q_state_1[3][0]}};
      $$_tmp_measureVar2 = true;
    } else {
      q_state_0 = new float[][]{new float[]{q_state_0[0][0]}, new float[]{0.0F}, new float[]{q_state_0[2][0]}, new float[]{0.0F}};
      q_state_1 = new float[][]{new float[]{q_state_1[0][0]}, new float[]{0.0F}, new float[]{q_state_1[2][0]}, new float[]{0.0F}};
      $$_tmp_measureVar2 = false;
    }
    boolean res2 = $$_tmp_measureVar2;
    return (res1 ? 2 : 0) + (res2 ? 1 : 0);
  }

  private static float[][] getOracle(int val) {
    assert val >= 0 && val < 4;
    return new float[][]{new float[]{val == 0 ? 1.0F : -1.0F, 0.0F, 0.0F, 0.0F}, new float[]{0.0F, val == 1 ? 1.0F : -1.0F, 0.0F, 0.0F}, new float[]{0.0F, 0.0F, val == 2 ? 1.0F : -1.0F, 0.0F}, new float[]{0.0F, 0.0F, 0.0F, val == 3 ? 1.0F : -1.0F}};
  }
}
import java.util.Random;

public class automath {
  public String sss() {
    StringBuilder sb = new StringBuilder();
    for (int m = 1; m <= 20; m++) {
      sb.append("  ");
      sb.append("练习" + m);
      sb.append("   ");
      for (int i = 1; i <= 5; i++) {
        Random r1 = new Random();
        int num = r1.nextInt(10) + 10;
        Random r2 = new Random();
        int num2 = r2.nextInt(10);
        Random r3 = new Random();
        int num3 = r3.nextInt(5);
        sb.append(num + "+" + num2 + "+" + num3 + "=");
        sb.append("    ");
        sb.append(num + "+" + num2 + "-" + num3 + "=");
        sb.append("   ");
        if (i % 3 == 0) {
          sb.append("   ");
        }
      }
      sb.append("\n");
      sb.append("\n");
    }
    return sb.toString();
  }
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	
    int N = Integer.parseInt(args[0]);
    String mode = args[1];
    boolean bol = mode.equals("v") || mode.equals("V");
    for (int numnew = 1; numnew <= N; numnew++) {
         if (bol) {
            if (numnew == 1) {
                 System.out.println("1 4 2 1 (4)");
                 continue;
                }
            int num1 = numnew;
            int steps = 1;
             StringBuilder line = new StringBuilder();
            line.append(num1);

                while (num1 != 1) {
                    if (num1 % 2 == 0) num1 = num1 / 2;
                    else num1 = 3 * num1 + 1;
                    line.append(" ").append(num1);
                    steps++;
                }
                line.append(" (").append(steps).append(")");
                System.out.println(line.toString());
            } else {
                int num1 = numnew;
                while (num1 != 1) {
                    if (num1 % 2 == 0) num1 = num1 / 2;
                    else num1 = 3 * num1 + 1;
                }
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
    
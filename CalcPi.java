// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int times = Integer.parseInt(args[0]);
	double sum = 0.0;
	for (int i = 0; i < times; i++) {
		double p = 1.0 / (2 * i +1);
		if (i % 2 == 1) {
			p = -p;
		}
		sum += p;
	}
	double approx = sum * 4;
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated:     " + approx);

	}

}

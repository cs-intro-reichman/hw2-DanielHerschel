// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int iterations = Integer.parseInt(args[0]);

	    double pi = 0.0, denominator = 1.0;
        int sign = 1;
	    for (int i = 0; i < iterations; i++) {
            pi += sign * (1.0 / denominator);

            sign = -sign;
            denominator += 2.0;
	    }
        pi *= 4.0;

        System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated: " + pi);
	}
}

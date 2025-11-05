// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
	    int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");

        for (int seedN = 1 ; seedN <= seed ; seedN++) {
            int sequenceCount = 0, n = seedN;
            String messageRow = "" + n;

            // Setting n to 4 for the first sequence.
            if (n == 1) {
                n = 4;
            }

            while (n != 1) {
                // Collatz Logic
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }

                messageRow += " " + n;
                sequenceCount++;
            }

            if (verbose) {
                System.out.println(messageRow + " (" + sequenceCount + ") ");
            }
        }

        System.out.printf("Every one of the first %d hailstone sequences reached 1.%n", seed);
	}
}

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
	    int seed = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");

        for (int seedN = 1 ; seedN <= seed ; seedN++) {
            int sequenceCount = 1, n = seedN;
            String messageRow = "" + n;

            do {
                // Collatz Logic
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }

                messageRow += " " + n;
                sequenceCount++;
            } while (n != 1);

            if (verbose) {
                System.out.println(messageRow + " (" + sequenceCount + ") ");
            }
        }

        System.out.printf("Every one of the first %d hailstone sequences reached 1.%n", seed);
	}
}

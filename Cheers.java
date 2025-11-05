//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String anLetters = "AEFHILMNORSX";

	    String message = args[0];
        int printCount = Integer.parseInt(args[1]);

        for (char letter : message.toCharArray()) {
            if (anLetters.indexOf(Character.toUpperCase(letter)) != -1) {
                System.out.printf("Give me an %c: %c!\n", letter, letter);
                continue;
            }

            System.out.printf("Give me a  %c: %c!\n", letter, letter);
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < printCount; i++) {
            System.out.println(message.toUpperCase() + "!!!");
        }
    }
}

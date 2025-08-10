import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // random number between 1 and 100
        int guess = 0;
        int tries = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != number) {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            tries++;

            if (guess > number) {
                System.out.println("Number guessed is too high, try again.");
            } else if (guess < number) {
                System.out.println("Number guessed is too low, try again.");
            } else {
                System.out.println("You guessed correctly .The  Total number of tries are : " + tries);
            }
        }
        input.close();
    }
}

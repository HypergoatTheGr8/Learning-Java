import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        String greaterOrLower;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        byte guess;
        int guessAttempts = 0;

        do {
            guess = input.nextByte();

            //checks if the guess is larger or smaller than the randomNumber
            if (guess < (byte) randomNumber) {
                greaterOrLower = "The number is larger than that.";
            } else if (guess > (byte) randomNumber) {
                greaterOrLower = "The number is smaller than that.";
            } else {
                greaterOrLower = "There was an error with the section that tells you if the number is larger or smaller.";
            }

            if (guess != (byte) randomNumber && guessAttempts == 2) {
                System.out.println("You ran out of guesses! the number was " + randomNumber);
            } else if (guess != (byte) randomNumber) {
                System.out.println("Incorrect. Try again. " + greaterOrLower);
            } else {
                System.out.println("You won! the number was " + randomNumber);
            }

            //adds one to guessAttempts so that user does not have infinite attempts at guessing
            guessAttempts++;
        }while (guessAttempts <= 2);
    }
}

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        byte guess;
        int guessAttempts = 0;
        while (guessAttempts <= 2) {
            guess = input.nextByte();
            if (guess != (byte) randomNumber && guessAttempts >= 2) {
                System.out.println("You ran out of guesses! the number was " + randomNumber);
            } else if (guess != (byte) randomNumber) {
                System.out.println("Incorrect. Try again. the number is " + randomNumber);
            } else if (guess == (byte) randomNumber) {
                System.out.println("You won! the number was " + randomNumber);
            }
            ++guessAttempts;
        }
    }
}

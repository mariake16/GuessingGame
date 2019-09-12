package guess.game;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		int guessNumber = random.nextInt(300);
		int numberTries = 0;
		int guess;
		boolean userCorrect = false;
		
		while (userCorrect == false) {
			
			System.out.println("Guess the number");
			guess = new Scanner(System.in).nextInt();
			numberTries++;
			
			if (guess == guessNumber) {
				userCorrect = true;
			}
			else if (guess > guessNumber) {
			System.out.println("Too high, try again ");
			}
			else if (guess < guessNumber) {
			System.out.println("Too low, try again ");
			}
		}
		System.out.println("You win!");
		System.out.println("It Took you " + numberTries + " tries. ");
	}

}

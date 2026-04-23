package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	/*
	 * Task 4: Number Guessing Game 
		Explanation: 
			• Use Random class to generate a number between 1–100 
			• User tries to guess the number 
			• Show hints: “Too low”, “Too high”, “Correct” 
			• Track number of attempts
	 */
	public static void main(String[] args) {
		Random randnum=new Random();
		int limit=randnum.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("---Number Guessing Game---");
		int guess;
		int count=0;
		do {
			count++;
			System.out.println("Enter number to guess in between 1-100 : ");
			guess=sc.nextInt();
			if(guess>limit)
				System.out.println("Too High , Enter another number!");
			else if(guess<limit)
				System.out.println("Too Low , Enter another number!");
			else
				System.out.println("Correct...\nCongratulations You won the game in "+count+" attempts.");
		}while(guess!=limit);
		sc.close();
	}
}

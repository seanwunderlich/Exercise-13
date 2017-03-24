/**
 * Sean Wunderlich
 * ITSE 1302-011
 * Exercise 13
 * Hi-Lo guessing game
 */

//This program allows the user to play a Hi-Lo guessing game until the user either guesses the number correctly or
//the user decides to quit playing

import java.util.Scanner;
import java.util.Random;

public class HiLoGame 
//Create class called HiLoGame
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		//Create Scanner called scan
		Random generator = new Random ();
		//Create Random called generator
		int intNumber2;
		//Establish intNumber2 as an integer
		int intNumberOfGuesses;
		//Establish intNumberOfGuesses as an integer
		boolean PlayAgain = true;
		//Run the following while PlayAgain is true
 
		while (PlayAgain) 
		{
			intNumberOfGuesses = 0;
			//Sets default value of intNumberOfGuesses to 0
			int intNumber1 = generator.nextInt(101) + 1;
			//Establishes intNumber1 as a random number between 1 and 100
			System.out.println("I'm thinking of a number between 1 and 100. \nGuess what it is." +
					"(Enter 0 to quit): ");
			//Print I'm thinking of a number between 1 and 100. Guess what it is. (Enter 0 to quit): 
			intNumber2 = scan.nextInt();
			//Scan user entry and assign it to intNumber2
			scan.nextLine();
			//Scans next linr
 
			while (intNumber2 != 0) 
			//while intNumber2 does not equal 0 execute the following	
			{
				if (intNumber2 < intNumber1) 
				//if intNumber2 is less than intNumber1
				{
					System.out.println("Sorry, your guess was too low. \nTry again. " +
							"(Enter 0 to quit): ");
					//print Sorry, your guess was too low. Try again. (Enter 0 to quit): 
					intNumber2 = scan.nextInt();
					//scan next int and assign to intNumber2
					scan.nextLine();
					//Scan next line
					intNumberOfGuesses++;
					//add guess to intNumberOfGuesses
				}
				else if (intNumber2 > intNumber1) 
				//otherwise, if intNumber2 is greater than intNumber1
				{
					System.out.println("Sorry, your guess was too high. \nTry again. " +
							"(Enter 0 to quit): ");
					//print Sorry, your guess was too high. Try again. (Enter 0 to quit): 
					intNumber2 = scan.nextInt();
					//scan next integer and assign to intNumber2
					scan.nextLine();
					//scan next line
					intNumberOfGuesses++;
					//add guess to intNumberOfGuesses
				}
				else 
				{
					System.out.println("Congratulations! You guessed correctly!");
					//print Congratulations! You guessed correctly!
					intNumberOfGuesses++;
					//add guess to intNumberOfGuesses
					System.out.println("Number of guesses: " + intNumberOfGuesses);
					//print total amount of guesses
					intNumber2 = 0;
					//assign 0 to intNumber2
				}
			}
			System.out.println("Would you like to play again? (y/n): ");
			//print Would you like to play again? (y/n):
			String input = scan.nextLine();
			//scan next line 
			if (input.equalsIgnoreCase("n")) 
			//if user enters n	
			{
				PlayAgain = false;
				//end game
			}
		}

	}

}

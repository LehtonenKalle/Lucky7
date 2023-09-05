package main;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int randomIntFirst;
		int randomIntSecond;
		int randomIntThird;
		
		System.out.println("Welcome to Lucky7!");
		System.out.println("Start by typing the amount of euros you want to play with.");
		
		int euros = Integer.parseInt(input.nextLine());
		
		do {
			euros--;
			
			randomIntFirst = random.nextInt(10) + 1;
			randomIntSecond = random.nextInt(10) + 1;
			randomIntThird = random.nextInt(10) + 1;
			
			if (randomIntFirst == 7 && randomIntSecond == 7 && randomIntThird == 7) {
				euros += 8;
				System.out.println("You got the numbers " + randomIntFirst + ", " + randomIntSecond + " and " + randomIntThird + ".");
				System.out.println("You gained 8 euros. You have " + euros + " euros left.\n");
			} 
			else if (randomIntFirst == 7 && randomIntSecond == 7 || randomIntFirst == 7 && randomIntThird == 7 || randomIntSecond == 7 && randomIntThird == 7) {
				euros += 5;
				System.out.println("You got the numbers " + randomIntFirst + ", " + randomIntSecond + " and " + randomIntThird + ".");
				System.out.println("You gained 5 euros. You have " + euros + " euros left.\n");
			} 
			else if (randomIntFirst == 7 || randomIntSecond == 7 || randomIntThird == 7) {
				euros += 3;
				System.out.println("You got the numbers " + randomIntFirst + ", " + randomIntSecond + " and " + randomIntThird + ".");
				System.out.println("You gained 3 euros. You have " + euros + " euros left.\n");
			} 
			else {
				System.out.println("You got the numbers " + randomIntFirst + ", " + randomIntSecond + " and " + randomIntThird + ".");
				System.out.println("You didn't win anything.");
				System.out.println("You have " + euros + " euros left.\n");
			} 
	
			
			
			System.out.println("If you want to keep playing: press enter.");
			System.out.println("If you want to quit: type \"e\" and press enter.");
			
			String userInput = input.nextLine();
			
			if (userInput.equals("e")) {
				System.out.println("Thank you for playing!");
				break;
			} 
			
		} while (euros > 0);
		
		System.out.println("Game over!");
	}
}

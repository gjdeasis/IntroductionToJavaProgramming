/*
 * Prompt: (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 */

import java.util.Scanner;

public class Exercise03_02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 7 % 10);
		int num3 = (int)(System.currentTimeMillis() / 5 % 10);
		int ans;
		
		System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + " ? ");
		ans = input.nextInt();
		
		System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + ans + " is " + (num1 + num2 + num3 == ans));
		
	}
}

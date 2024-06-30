/*
 * Prompt: (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer.
 * Here is a sample run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932970
 */

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final int INITIAL_POPULATION = 312032486;
		final int SECONDS_IN_YEAR = 60 * 60 * 24 * 365;
		double birthsPerYear = SECONDS_IN_YEAR/7.0;
		double deathsPerYear = SECONDS_IN_YEAR/13.0;
		double immigrantsPerYear = SECONDS_IN_YEAR/45.0;
		int years, finalPopulation;
		
		System.out.print("Enter the number of years: ");
		years = input.nextInt();
		
		
		finalPopulation = (int) (INITIAL_POPULATION + (birthsPerYear + immigrantsPerYear - deathsPerYear) * years);
		System.out.println("The population in " + years + " years is " + finalPopulation);
	}

}

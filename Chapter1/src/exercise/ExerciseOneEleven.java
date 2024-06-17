/*
 * Prompt:(Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 * 
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and
 * 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
 * one of the values involved in the division must be a number with a decimal point.
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */
package exercise;

public class ExerciseOneEleven {

	public static void main(String[] args) {
	
		System.out.println(312032486 + (60 * 60 * 24 * 365)/7.0 + (60 * 60 * 24 * 365)/45.0 - (60 * 60 * 24 * 365)/13.0);
		System.out.println(312032486 + ((60 * 60 * 24 * 365)/7.0 + (60 * 60 * 24 * 365)/45.0 - (60 * 60 * 24 * 365)/13.0) * 2);
		System.out.println(312032486 + ((60 * 60 * 24 * 365)/7.0 + (60 * 60 * 24 * 365)/45.0 - (60 * 60 * 24 * 365)/13.0) * 3);
		System.out.println(312032486 + ((60 * 60 * 24 * 365)/7.0 + (60 * 60 * 24 * 365)/45.0 - (60 * 60 * 24 * 365)/13.0) * 4);
		System.out.println(312032486 + ((60 * 60 * 24 * 365)/7.0 + (60 * 60 * 24 * 365)/45.0 - (60 * 60 * 24 * 365)/13.0) * 5);
		/*
		 * 60 * 60 * 24 = num seconds per day
		 * (60 * 60 * 24 * 365)/7.0 = births per year
		 * (60 * 60 * 24 * 365)/13.0 = deaths per year
		 * (60 * 60 * 24 * 365)/45.0 = new immigrants per year
		 * Add number of births per year and number of immigrants per year
		 * Subtract number of deaths per year
		 * Those two calculations will give the number of people to add to the population per year
		 * Add that to the base population
		 * Repeat to get the next five years, multiplying by the number of years
		 * This would be a lot easier if we used variables but I don't think that has been covered in chapter 1
		 */

	}

}

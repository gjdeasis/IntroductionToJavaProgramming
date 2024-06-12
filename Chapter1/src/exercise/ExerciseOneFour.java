/*
 * (Print a table) Write a program that displays the following table:
 * a   a^2 a^3
 * 1   1   1
 * 2   4   8
 * 3   9   27
 * 4   16  64
 */
package exercise;

public class ExerciseOneFour {
	public static void main(String[] args) {
		System.out.println("Solution 1: Use the print function (which is what has been covered in the book so far)");
		System.out.println("a   a^2 a^3");
		System.out.println("1   1   1");
		System.out.println("2   4   8");
		System.out.println("3   9   27");
		System.out.println("4   16  64");
		
		System.out.println();
		System.out.println("Solution 2: Create a table");
		final Object [][] table = new String [5][];
		table[0] = new String[] {"a", "a^2", "a^3"};
		table[1] = new String[] {"1", "1", "1"};
		table[2] = new String[] {"2", "4", "8"};
		table[3] = new String[] {"3", "9", "27"};
		table[4] = new String[] {"4", "16", "64"};
		for(final Object[] row : table) {
			System.out.format("%-5s%-5s%-5s%n", row);
		}
	}
}

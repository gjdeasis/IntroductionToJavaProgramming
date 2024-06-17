/*
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
 * ax + by = e
 * cx + dy = f
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */

package exercise;

public class ExerciseOneThirteen {
	
	public static void main(String[] args) {
		/*
		 * a = 3.4
		 * b = 50.2
		 * c = 2.1
		 * d = 0.55
		 * e = 44.5
		 * f = 5.9
		 * x = (ed - bf) / (ad - bc) = (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1)
		 * y = (af - ec) / (ad - bc) = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1)
		 * You can check if you did it correctly by substituting x and y back into your equation and seeing if the result is 44.5 for the first equation and 5.9 for the second
		 * 
		 * 3.4 * (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1) + 50.2 * (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1) = 44.5
		 * 2.1 * (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1) + 0.55 * (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1) = 5.9
		 * 
		 * System.out.println(3.4 * (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1) + 50.2 * (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
		 * System.out.println(2.1 * (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1) + 0.55 * (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
		 */
		
		System.out.print("X = ");
		System.out.println((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
		System.out.print("Y = ");
		System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1));
		
	}
}
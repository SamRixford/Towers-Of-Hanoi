package Assignments;
import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);;
		
		System.out.println("How many plates are on the first peg?");
		int num = scnr.nextInt();
		solve(num, "orignal", "extra", "destination");
		System.out.println("The total number of steps is " + (nSteps(num) - 1));     //This uses the recursive code for a number to a power of another number and the formula given in the lecture notes.
		
	}
		// For this, plate 1 is always the top plate or the smallest disk while each plate on below it is the next numbered plate.
		
		public static void solve (int num, String firstPeg, String secondPeg, String thirdPeg) {
			
		if (num == 1) {
			System.out.println("Move plate number " + num + " from the " + firstPeg + " peg to the " + thirdPeg + " peg");
		}
		else {
			
			solve(num - 1, firstPeg, thirdPeg, secondPeg);
			System.out.println("Move plate number " + num + " from peg " + firstPeg + " to the " + thirdPeg + " peg");
			solve(num-1, secondPeg, firstPeg, thirdPeg);
		}
	}
		
		public static int nSteps (int num) {
			
			if (num == 1) {
				return 2;
			}
			else {
				return 2 * nSteps(num - 1);
			}
			
		}

}

package com.kennesaw.hamilton.Chapter20;

import java.util.Scanner;

public class ComputeFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int n = input.nextInt();
		
		// Display factorial
		System.out.print("Factorial of " + n + " is " + factorial(n));
	}

	// Return the factorial for the specified number
	private static long factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0) // Base case
			return 1;
		else
		return n * factorial(n - 1); // Recursive call
	}
}

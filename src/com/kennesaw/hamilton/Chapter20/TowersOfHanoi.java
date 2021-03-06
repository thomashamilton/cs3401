package com.kennesaw.hamilton.Chapter20;

import java.util.Scanner;

public class TowersOfHanoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of disks: ");
		int n = input.nextInt();
		
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A','B','C');
	}

	private static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		// TODO Auto-generated method stub
		if (n == 1) // Stopping condition
			System.out.println("Move disk " + n + " from " +
		fromTower + " to " + toTower);
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " +
			fromTower + " to " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}

}

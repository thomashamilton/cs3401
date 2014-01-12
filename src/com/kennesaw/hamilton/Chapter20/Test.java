package com.kennesaw.hamilton.Chapter20;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(
				"Sum is " + xMethod(5));
	}

	private static int xMethod(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return 1;
		else 
			return n + xMethod(n - 1);
	}
}

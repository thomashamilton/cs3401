package com.kennesaw.hamilton.Chapter20;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xMethod(5);
	}

	private static void xMethod(int i) {
		// TODO Auto-generated method stub
		if (i > 0) {
			System.out.print(i + " ");
			xMethod(i - 1);
		}
	}
}

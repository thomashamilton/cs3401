package com.kennesaw.hamilton.Chapter20;

public class Test4 {

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
			xMethod(i - 1);
			System.out.print(i + " ");
		}
	}
}

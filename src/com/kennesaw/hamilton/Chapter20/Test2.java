package com.kennesaw.hamilton.Chapter20;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xMethod(1234567);
	}

	private static void xMethod(int i) {
		// TODO Auto-generated method stub
		if (i > 0) {
			System.out.print(i % 10);
			xMethod(i/10);
		}
	}

}

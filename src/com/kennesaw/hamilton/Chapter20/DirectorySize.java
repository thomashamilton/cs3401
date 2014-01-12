package com.kennesaw.hamilton.Chapter20;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prompt the user to enter a directory for a file
		System.out.print("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory  = input.nextLine();
		
		// Display the size
		System.out.println(getSize(new File(directory)) + " bytes");
	}

	private static long getSize(File file) {
		// TODO Auto-generated method stub
		long size = 0; // Store the total size of all files
		
		if (file.isDirectory()) {
			File[] files = file.listFiles(); // All files and subdirectories
			for (int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]); // Recursive call
			}
		}
		return size;
	}
	

}

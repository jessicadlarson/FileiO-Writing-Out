package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		writeToFile();
	}
		
		
		public static void writeToFile() {
			File file = new File("FizzBuzz.txt");
			
			try (PrintWriter writer = new PrintWriter(file.getAbsoluteFile())) {	
				
				for (int i = 1; i < 301; i++) {
					String inputAsString = Integer.toString(i);
					if (i % 5 == 0 && i % 3 == 0) {
						writer.println("FizzBuzz");
					} else if (i % 5 == 0 || inputAsString.contains("5")) {
						writer.println("Buzz");
					} else if (i % 3 == 0 || inputAsString.contains("3")) {
						writer.println("Fizz");
					} else {
						writer.println(i);
					}
			}
				writer.flush();
				writer.close();
				} catch (FileNotFoundException e) {
				System.out.println("Error!");
			}
		}
	

}

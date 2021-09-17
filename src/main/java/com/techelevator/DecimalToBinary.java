package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a series of decimal numbers separated by single spaces: ");

		String line = scanner.nextLine();
		String[] decimalNumbers = line.split(" ");

		for (String num : decimalNumbers) {

			int originalDecimal = Integer.parseInt(num);
			String binary = "";
			int decimal = originalDecimal;

			while (decimal > 0) {
				int tempOneOrZero = decimal % 2;
				String oneOrZero = String.valueOf(tempOneOrZero);
				binary = oneOrZero + binary;
				decimal /= 2;
			}
			System.out.println(originalDecimal + " in binary is: " + binary);
		}
	}

}

package com.techelevator;

import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amountBill = 0; // input for the bill
		double amountTendered = 0; // input for tendered
		double change; //their change

		String input = "";

		System.out.println("Please enter the amount of the bill: ");
		input = scanner.nextLine();
		amountBill = Double.parseDouble(input);

		System.out.println("Please enter the amount tendered: ");
		input = scanner.nextLine();
		amountTendered = Double.parseDouble(input);

		change = amountTendered - amountBill;

		System.out.println("The change required is " + Math.round(change * 100.0) / 100.0);


	}

}

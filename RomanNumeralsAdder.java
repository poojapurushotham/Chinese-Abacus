package bina;

import java.util.Scanner;

/*
 * Class that has the driver function to add 2 Roman Numeral Strings using the Roman Abacus
 * 
 */
public class RomanNumeralsAdder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RomanAbacus abacuss = new RomanAbacus();
		String num1, num2;
		
		while(true) {
			System.out.println("Enter first Roman Numeral");
			num1 = sc.next();
			if (!Validator.isValid(num1)) {
				System.out.println("Invalid Roman Numeral " + num1 + ". Try again!");
				sc.nextLine();//clear buffer
			} else {
				break;
			}
		}
		if (abacuss.insert(num1)) {
			System.out.println("First Roman Numeral " + num1 + " inserted successfully");
		}
		
		while(true) {
			System.out.println("Enter second Roman Numeral");
			num2 = sc.next();
			if (!Validator.isValid(num2)) {
				System.out.println("Invalid Roman Numeral " + num2);
				sc.nextLine();//clear buffer
			} else {
				break;
			}
		}
		if (abacuss.insert(num2)) {
			System.out.println("Second Roman Numeral " + num2 + " added successfully");
		}
		System.out.println("Sum of Roman Numerals " + num1 + " and " + num2 + " = " + abacuss.retrieve());
	}
}

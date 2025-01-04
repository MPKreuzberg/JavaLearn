package logicalOperators;

import java.util.Scanner;

// logical operators = used to connect two or more expressions
//
//                     && = (AND) both conditions must be true
//                     || = (OR)  either condition must be true
//                      ! = (NOT) reverses boolean condition of a condition

public class Main {

	public static void main(String[] args) {
		// if both conditions are true (AND) operator
		/*
		 * int temp = 10;
		 * 
		 * if (temp > 30) { System.out.println("It is hot outside"); } else if
		 * (temp >= 20 && temp <= 30) {
		 * System.out.println("It is warm outside"); } else {
		 * System.out.println("It is cold outside!"); } scanner.close();
		 */

		// if one of operators is true

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("You are playing a game. Press q or Q to quit!");
		 * String response = scanner.next();
		 * 
		 * if (response.equals("q") || response.equals("Q")) {
		 * System.out.println("You quit the game"); } else {
		 * System.out.println("Still in the game *pew pew*"); } scanner.close();
		 */

		// NOT operator

		Scanner scanner = new Scanner(System.in);

		System.out.println("You are playing a game. Press q or Q to quit!");
		String response = scanner.next();

		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("Still in the game! *pew pew*");
		}
		scanner.close();
	}

}

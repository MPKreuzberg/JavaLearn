package whileLoops;

import java.util.Scanner;

// While loop = executes a block of code as long as it's condition remains true 

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";

		/*
		 * while (name.isBlank()) { System.out.println("Enter your name: ");
		 * name = scanner.nextLine(); }
		 */

		do {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		} while (name.isBlank());

		System.out.println("Hello " + name);

		scanner.close();
	}
}

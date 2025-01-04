package userInput;
import java.util.Scanner; //import java utility

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scanner.nextLine();

		System.out.println("How old are you? ");
		int age = scanner.nextInt(); // if we input letters to int we get
										// exception
		scanner.nextLine(); // after inserting nextInt we have to clear the
							// scanner.

		System.out.println("What is you favourite food? ");
		String food = scanner.nextLine();

		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
		System.out.println("Your favourite food is " + food);

		scanner.close();// always close scanner on the end !!!
	}

}
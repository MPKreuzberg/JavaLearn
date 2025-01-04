package mathMethods;

import java.util.Scanner;

// ********************MATH METHODS**********************
// double x = 3.14;
// double y = 10;

// double z = Math.max(x, y); // comparing values finds and assign
// larger number to variable z

// double z = Math.min(x, y); // comparing values finds and assign
// lesser number to variable z

// double z = Math.abs(y); // gives the absolute value of number

// double z = Math.sqrt(y); // calculates the square root of number

// double z = Math.round(x); // rounds decimal number to lower or higher
// value

// double z = Math.ceil(x); // always rounds up

// double z = Math.floor(x);// always rounds down

//System.out.println(z);

//****************************END******************************

public class Main {

	public static void main(String[] args) {

		double x;
		double y;
		double z;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter side x: ");
		x = scanner.nextDouble();

		System.out.println("Enter side y: ");
		y = scanner.nextDouble();

		z = Math.sqrt((x * x) + (y * y));

		System.out.println("The hypotenuse is: " + z);
		scanner.close();

	}

}

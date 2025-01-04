package arrayBasic;

// array = used to store multiple values in a single variable

public class Main {

	public static void main(String[] args) {

		// String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		// cannot assign different types of data
		// cars[0] = "Mustang";

		String[] cars = new String[3];

		cars[0] = "Camaro";
		cars[1] = "Corvette";
		cars[2] = "Tesla";

		// System.out.println(cars[0]);
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}

}

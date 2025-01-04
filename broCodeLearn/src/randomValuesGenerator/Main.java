package randomValuesGenerator;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		// int x = random.nextInt();
		int x = random.nextInt(5); // on that way we can limit range of numbers
									// for generator
		double y = random.nextDouble(); // generates random number between 0 and
										// 1
		boolean z = random.nextBoolean();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}


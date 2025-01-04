package expressions;

public class Main {

	public static void main(String[] args) {

		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %

		// int friends = 10;
		double friends = 10;

		// friends = friends + 1;
		// friends++;
		// friends--;
		// friends = friends - 1;
		// friends = friends * 20;
		// friends = friends / 2;
		friends = (double) friends / 3; // if we divide with number that gives
										// decimal result we should use (double)
										// instead of integer here on the left
										// side of expression
		// friends = friends % 4;

		System.out.println(friends);

	}

}
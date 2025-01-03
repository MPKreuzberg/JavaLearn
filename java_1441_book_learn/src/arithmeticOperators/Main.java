package arithmeticOperators;

public class Main {

	public static void main(String[] args) {

//		int res = 6 + 4 - 2;
//		System.out.println(res);
//		System.out.println(10 / 3);

		int res = 3 + 2 * 4;
		// 3+8=11 here operator * has high precedence over +
		System.out.println(res);
		// 6*4 = 24 here parenthesis change grouping and changes result
		// expression now evaluates 5*4=20
		res = (3 + 2) * 4;
		System.out.println(res);
		// here is shown how + and - associates from left to right: 10-2=8
		res = 6 + 4 - 2;
		System.out.println(res);
		// here is shown how *, /, and % also associate from left to right
		// this expression evaluates: 2*6%10 and this evaluates 12%10 which is 2 ???
		res = 10 / 4 * 6 % 10;
		System.out.println(res);

	}

}
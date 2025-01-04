package variableSwapping;

public class Main {

	public static void main(String[] args) {

		String x = "water";
		String y = "Juice";
		String temp;// we can set temp to null or just leave it empty

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}

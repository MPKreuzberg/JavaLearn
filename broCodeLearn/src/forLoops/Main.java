package forLoops;

//for loop = executes a block of code a limited amount of time
// index = i

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		for (int i = 10; i >= 0; i -= 2) {
			System.out.println(i);
		}
		for (int i = 10; i >= 0;) {
			System.out.println(i);
			i -= 2;
		}
		System.out.println("Happy New Year!!!");
	}

}


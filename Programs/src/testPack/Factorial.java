package testPack;

public class Factorial {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			facto(i);
		}
	}

	static void facto(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " :" + fact);

	}

}

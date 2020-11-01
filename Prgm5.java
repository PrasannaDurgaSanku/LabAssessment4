import java.util.*;

public class Prgm5 {

	static void checkNumber(int n) throws ArithmeticException {
		try {

			if (n > 100) {
				throw new ArithmeticException("Number can't be greater than 100");
			} else
				System.out.println("Number less than 100");
		} catch (ArithmeticException e) {
			System.out.println("Number can't be greater than 100 exception caught");
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		n = scanner.nextInt();
		checkNumber(n);
	}

}
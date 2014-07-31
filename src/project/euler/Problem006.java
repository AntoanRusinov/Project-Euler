package project.euler;

public class Problem006 {

	public static int sumOfSquares(int number) {

		int total = 0;

		for (int X = 1; X <= number; X++) {
			total += X * X;
		}
		System.out.println(total);
		return total;
	}

	public static int squareOfSum(int number) {

		int total = 0;

		for (int i = 1; i <= number; i++) {
			total += i;
		}
		total *= total;
		System.out.println(total);
		return total;
	}

	public static void main(String[] args) {

		int result = squareOfSum(100) - sumOfSquares(100);
		System.out.println("RESULT: " + result);

	}

}

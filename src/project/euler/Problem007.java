package project.euler;

public class Problem007 {

	public static boolean isPrime(int number) {
		if (number == 2)
			return true;
		if (number % 2 == 0 || number == 1)
			return false;
		long limit = (long) Math.sqrt(number);
		for (int i = 3; i <= limit; i += 2)
			if (number % i == 0) {
				return false;
			}
		return true;
	}

	public static void main(String args[]) {
		int count = 1;
		int i = 3;
		while (count < 10001) {
			if (isPrime(i))
				++count;
			i += 2;
		}
		System.out.println(i - 2);
	}

}

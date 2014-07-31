package project.euler;

public class Problem003 {

	public boolean isPrime(long n) {

		if (n % 2 == 0) {
			return false;
		}

		long half = (n / 2) % 2 == 0 ? (n / 2) - 1 : n / 2;

		for (int i = 3; i < half; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Problem003 p = new Problem003();

		long number = 600851475143L;
		long devide = 2;
		while (true) {
			long temp = 600851475143L / devide;
			if (number % temp == 0 && p.isPrime(temp)) {
				System.out.println(temp);
				break;
			}
			devide++;
		}

	}
}

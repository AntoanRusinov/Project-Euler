package project.euler;

public class MultiplesOf3And5 {

	public static void main(String[] args) {

		int sum = 0;

		for (int n = 0; n < 1000; n++) {
			if (n % 3 == 0 || n % 5 == 0) {
				sum += n;
			}
		}
		System.out.println(sum);
	}

}

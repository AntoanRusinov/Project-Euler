package project.euler;

public class Problem004 {

	public boolean isPalindrome(String s) {

		if (s.length() % 2 != 0) {
			s = s.substring(0, s.length() / 2)
					+ s.substring((s.length() / 2) + 1);
		}

		return new StringBuffer(s.substring(0, s.length() / 2)).reverse()
				.toString().equals(s.substring(s.length() / 2));
	}

	public static void main(String[] args) {
		Problem004 test = new Problem004();
		long biggest = 0;

		int a = 999, b = 999;
		for (int bb = b; bb > 0; bb--) {
			for (int aa = a; aa > 0; aa--) {
				if (test.isPalindrome(new Long(aa * bb).toString())) {
					if (aa * bb > biggest) {
						biggest = aa * bb;
					}
				}
			}
		}

		System.out.println(biggest);

	}
}

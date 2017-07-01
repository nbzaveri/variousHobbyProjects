package hackerrank.code;

import java.util.Scanner;

public class Day9Recursion {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		int result = factorial(n);
		System.out.println(result);
	}

	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}

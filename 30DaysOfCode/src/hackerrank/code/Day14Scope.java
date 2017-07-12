package hackerrank.code;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here
	Difference(int[] elements) {
		this.elements = elements;
	}

	void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i; j < elements.length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				maximumDifference = diff > maximumDifference ? diff : maximumDifference;
			}
		}
	}
}

public class Day14Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}

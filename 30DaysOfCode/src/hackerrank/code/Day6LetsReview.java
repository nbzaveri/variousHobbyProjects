package hackerrank.code;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String inputStr = in.nextLine();
			char[] inChr = inputStr.toCharArray();

			char[] newStr = new char[inChr.length + 1];
			int k = 0;
			int l = (inChr.length % 2 == 0) ? (inChr.length / 2 + 1) : (inChr.length / 2 + 2);
			for (int j = 0; j < inChr.length; j++) {
				if (j % 2 == 0) {
					newStr[k] = inChr[j];
					k++;
				} else {
					newStr[l] = inChr[j];
					l++;
				}
			}
			newStr[k] = ' ';

			for (char element : newStr) {
				System.out.print(element);
			}
			System.out.println();
		}
		in.close();
	}

}

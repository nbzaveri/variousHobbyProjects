package hackerrank.code;

import java.util.Scanner;

public class Day16Exceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		try {
			System.out.println(Integer.valueOf(S));
		} catch (Exception e) {
			System.out.println("Bad String");
		}
		in.close();
	}
}

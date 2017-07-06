package hackerrank.code;

import java.util.Scanner;
import java.util.Stack;

public class Day10BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stack binaryNum = new Stack();
		int counter = 0, maxNo1 = 0, lastOne = 0, thisOne = 0;
		do {
			// lastOne = thisOne;
			thisOne = n % 2;
			binaryNum.push(thisOne);
			// System.out.println("lastOne: " + lastOne + " ThisOne: " + thisOne);
			n = n / 2;
			if (thisOne == 1) {
				counter++;
				maxNo1 = counter > maxNo1 ? counter : maxNo1;
			} else {
				counter = 0;
			}
		} while (n > 0);

		System.out.println(maxNo1);
		// System.out.println(binaryNum + " " + maxNo1);

	}
}

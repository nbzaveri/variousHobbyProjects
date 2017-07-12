package hackerrank.code;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class Solution {
	public static Node insert(Node head, int data) {
		// Complete this method
		if (head == null) {
			return head = new Node(data);
		} else {
			Node start = head, current = head;

			while (current != null) {
				start = current;
				current = current.next;
			}
			Node newNode = new Node(data);
			start.next = newNode;
			return head;
		}
	}
}

public class Day15LinkedList {
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = Solution.insert(head, ele);
		}
		display(head);
		sc.close();
	}
}

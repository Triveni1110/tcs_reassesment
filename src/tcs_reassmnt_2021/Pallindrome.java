package tcs_reassmnt_2021;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		// to check if the number is pallindrome or not
		checkNumberPallindrome(num);

		String test = scan.next();
		CheckStringPallindrome(test);

	}

	private static void CheckStringPallindrome(String test) {
		StringBuilder sb1 = new StringBuilder(test.toLowerCase());
		sb1.reverse();
		String rev=sb1.toString();
		if (test.equalsIgnoreCase(rev)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}
	}

	private static void checkNumberPallindrome(int num) {
		int temp = num;
		// reverse a no
		int rem = 1;
		int revnum = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			revnum = revnum * 10 + rem;
		}

		if (revnum == temp) {
			System.out.println("The number is pallindrome");
		} else {
			System.out.println("the number is not pallindrome");

		}

	}

}

package tcs_reassmnt_2021;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(fact(num));
	}

	private static int fact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num*fact(num - 1);
		}
	}

}

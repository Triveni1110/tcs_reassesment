package tcs_reassmnt_2021;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t0 = 0;
		int t1 = 1;

		int noOfTerms = scan.nextInt();
		int i = 0;
		int sum = 0;

		System.out.print("" + t0 + " " + t1);

		while (i < noOfTerms) {
			sum = t0 + t1;
			System.out.print(" " + sum);
			t0 = t1;
			t1 = sum;
			i++;
		}
		System.out.println();
//		setFibbonaciArray(noOfTerms);
		int searchTerm = scan.nextInt();
		int result = fib(searchTerm);
		System.out.println(result);

	}

	private static int fib(int searchTerm) {
		if (searchTerm == 1 || searchTerm == 2) {
			return searchTerm-1;
		} else {
			return (fib(searchTerm - 1) + fib(searchTerm - 2));
		}
	}

	private static void setFibbonaciArray(int noOfTerms) {
		System.out.println("setFibonnaiArray is running");
		Scanner scan = new Scanner(System.in);
		int a[] = new int[noOfTerms];
		int i = 0;
		while (i < noOfTerms) {
			if (i == 0 || i == 1) {
				a[i] = i;
			} else {
				a[i] = a[i - 1] + a[i - 2];
			}
			i++;
		}

		System.out.println("Enter the no of term you want to search::");
		int searchTerm = scan.nextInt();
		System.out.println(a[searchTerm - 1]);
	}

}

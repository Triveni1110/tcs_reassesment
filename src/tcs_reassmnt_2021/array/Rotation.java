package tcs_reassmnt_2021.array;

import java.util.Scanner;

public class Rotation {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a[] = { 10, 20, 30, 40, 10, 20, 30, 60, 70, 80, 90 };

		System.out.println("Enter the number of itme you want to left rotate the array");
		int noOfTime = scan.nextInt();
		// rotating one time left
		for (int k = 0; k < noOfTime; k++) {
			int temp = a[0];

			int i = 0;
			for (; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[i] = temp;
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(" " + a[j]);
		}

		// rotating left side - N time
		System.out.println("second");
		if (noOfTime > a.length) {

		} else {
			int tempArry[] = new int[noOfTime];
			int j = 0;
			for (; j < tempArry.length; j++) {
				tempArry[j] = a[j];
			}
			int k = 0;
			for (; k < a.length - noOfTime; k++) {
				a[k] = a[j];
				j++;
			}
			int l = 0;
			for (; k < a.length; k++) {
				a[k] = tempArry[l];
				l++;

			}

			for (int l2 = 0; l2 < a.length; l2++) {
				System.out.print(" " + a[l2]);

			}
		}
	}
}

package tcs_reassmnt_2021.array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyElement {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int noOfElements = scan.nextInt();
		int array1[] = new int[noOfElements];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scan.nextInt();
		}
		System.out.println("Simply copy the array only");
		int copyArray[] = array1;
		for (int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i]);
		}

		System.out.println("Copy the array after sorting in ascending order.");
		Arrays.sort(array1);
		for (int i : array1) {
			System.out.println(i);
		}
	}

}

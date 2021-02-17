package tcs_reassmnt_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("To check if the number is prime number or not");
		int num = scan.nextInt();
		boolean ifPrime = true;
		if (num == 0 || num == 1) {
			ifPrime = false;
		} else {

			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					ifPrime = false;
				}
			}
		}
		String status = ifPrime ? "The number is prime number" : "The number is not prime number";
		System.out.println(status);

		System.out.println("To find all the prime number between two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int min = (num1 > num2) ? num2 : num1;
		int max = (num1 > num2) ? num1 : num2;
		findInBetweenPrimeNumber(min, max);
	}

	private static void findInBetweenPrimeNumber(int min, int max) {
		List<Integer> primeNumber = new ArrayList<>();
		if (min < 0 || max < 0) {
		} else {
			for (int i = min; i <= max; i++) {
				if (isPrime(i)) {
					primeNumber.add(i);
				}

			}
		}
		System.out.println(primeNumber);
	}

	private static boolean isPrime(int num) {
		boolean ifPrime = true;
		if (num == 0 || num == 1) {
			ifPrime = false;
		} else {

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					ifPrime = false;
				}
			}
		}
		return ifPrime;
	}

}

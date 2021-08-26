package com.ds.algorithms;

import java.util.Scanner;

/**
 * Program to check prime numbers within given range
 * @author Sheetal
 * @since 2021-08-26
 */
public class PrimeNoRange {
	
	/**
	 * Method to take inputs of upper bound and lower bound of numbers from user
	 * computes to find prime number in that given range by user
	 */
	public void findprime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower bound : ");
		int start = sc.nextInt();
		System.out.print("Enter upper bound : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between " + start + " and " + end + " are : ");
		int count;
		for (int i = start; i <= end; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
	
	/**
	 * Main method that 
	 * creates object primeNoRange and 
	 * calls findprime method to print the prime numbers 
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNoRange primeNoRange = new PrimeNoRange();
		primeNoRange.findprime();

	}
}

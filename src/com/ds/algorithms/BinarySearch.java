package com.ds.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to perform binary search of the word from list
 * @author Sheetal
 * @since 2021-08-26
 */
public class BinarySearch {
	
	/**
	 * Method for binary search algorithm 
	 * @param UserStringArray
	 * @param check
	 * @return -1
	 */
	static int binarySearchAlgo(String UserStringArray[], String check) {
		int left = 0;
		int right = UserStringArray.length - 1;
		while (left <= right) {
			int middle = left + (right - 1) / 2;
			// checking the string using compareTo
			int temp = check.compareTo(UserStringArray[middle]);
			if (temp == 0)
				return middle;
			if (temp > 0)
				left = middle + 1;
			else {
				right = middle - 1;
			}
		}
		return -1;
	}
	
   	/**
	 * Sorting the word list and 
	 * doing the binary search
	 * printing the result
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of word separated by comma ',' :");
		String userString = sc.next();
		String[] userStringArray = userString.split(",");
		Arrays.sort(userStringArray);
		System.out.println("Enter the word to check :");
		String check = sc.next();
		// Checking binarySearchAlgo & storing in result
		int result = binarySearchAlgo(userStringArray, check);
		if (result == -1) {
			System.out.println("word not present");
		} else
			System.out.println(" word present at index : " + result);

		sc.close();
	}

}

package com.ds.algorithms;

import java.util.Scanner;

/**
 * Program to return all permutations of a string
 * @author Sheetal
 * @since 2021-08-26
 */
public class PermutationsOfString {
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		permute(str, 0, str.length());
	}
	
	/**
	 * Calculating permutation of string
	 * @param str
	 * @param start
	 * @param end
	 */
	private static void permute(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				permute(str, start + 1, end);
				str = swapString(str, start, i);
			}
		}
	}
	
	/**
	 * Method for swap position of string
	 * i and j for changing position
	 * @param string
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swapString(String string, int i, int j) {
		char temp;
		char[] charArray = string.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}

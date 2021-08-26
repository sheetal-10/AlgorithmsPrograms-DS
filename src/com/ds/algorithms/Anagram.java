package com.ds.algorithms;

import java.util.Arrays;

/**
 * program to detect anagram between two strings
 * @author Sheetal
 * @since 2021-08-26
 */
public class Anagram {
    	/**
   	 * Method to check whether two strings are anagram
    	 * @param str1
     	 * @param str2
     	 */
	static boolean Anagram(char[] str1, char[] str2) {
		// taking length of both strings
		int n1 = str1.length;
		int n2 = str2.length;
		// Checking the length
		if (n1 != n2)
			return false;
		// Sorting both the strings
		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++) {
			// Compare sorted strings
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

   	 /**
     	  * Main method which have 2 string arrays
     	  * and checks the strings are anagram or not by calling Anagram method
     	  * @param args unused
     	  */
	public static void main(String args[]) {
		char str1[] = { 'a', 'b', 'c', 'd' };
		char str2[] = { 'd', 'c', 'b', 'a' };

		if (Anagram(str1, str2)) {
			System.out.println("The two strings are anagram ");
		} else {
			System.out.println("The two strings are not anagram ");
		}
	}
}

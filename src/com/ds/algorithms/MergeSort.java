package com.ds.algorithms;

import java.util.Arrays;

/**
 * Program to sort an array using merge sort
 * @author Sheetal
 * @since 2021-08-26
 */
public class MergeSort {
	/**
	 * Method to merge to sub arrays L and M into array
	 * @param array
	 * @param p
	 * @param q
	 * @param r
	 */
	void merge(int array[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		// Creating two sub arrays L and M
		int L[] = new int[n1];
		int M[] = new int[n2];
		// fill the left and right array
		for (int i = 0; i < n1; i++)
			L[i] = array[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = array[q + 1 + j];
		// Maintain current index of sub-arrays and main array
		int i, j, k;
		i = 0;
		j = 0;
		k = p;
		// Until we reach either end of either L or M, pick larger among
		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = M[j];
				j++;
			}
			k++;
		}
		// When we run out of elements in either L or M, pick up the remaining elements
		// and put in Array
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = M[j];
			j++;
			k++;
		}
	}

	/**
	 * Method to divide the array into sub arrays,
	 * sort them and merge them
	 * @param array
	 * @param left
	 * @param right
	 */
	void mergeSort(int array[], int left, int right) {
		if (left < right) {
			// m is the point where the array is divided into two sub arrays
			int mid = (left + right) / 2;
			// recursive call to each sub arrays
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			// Merge the sorted sub arrays
			merge(array, left, mid, right);
		}
	}

	
	/**
	 * Main method to create an unsorted array
	 * creating object and calling mergesort method to sort the array
	 * printing the sorted array
	 */
	public static void main(String args[]) {
		// created an unsorted array
		int[] array = { 6, 5, 12, 10, 9, 1 };
		// Creating object for MergeSort Class
		MergeSort mergeObj = new MergeSort();

		// calling mergeSort method & pass argument: array, first index and last index
		mergeObj.mergeSort(array, 0, array.length - 1);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(array));
	}
}

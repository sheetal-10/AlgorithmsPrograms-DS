package com.ds.algorithms;

/**
 * Program to sort an array using insertion sort
 * @author Sheetal
 * @since 2021-08-26
 */
public class InsertionSort {
	/**
	 * Method for creating insertion sort algorithm
	 * @param arr
	 */
	public void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/**
	 * Method for printing insertion array
	 * @param arr
	 */
	static void print(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + "");
	}

	/**
	 * Main method for 
	 * sorting the array and 
	 * printing the array after insertion sort
	 * @param args unused
	 */
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6 };
		System.out.println("Arry After Sorting:");
		InsertionSort is = new InsertionSort();
		// calling sort method
		is.insertionSort(arr);
		// Calling printArray method
		print(arr);
	}
}

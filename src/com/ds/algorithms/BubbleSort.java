package com.ds.algorithms;

/**
 * Program to read integers and 
 * print them in sorted order using bubble sort
 * @author Sheetal
 * @since 2021-08-26
 */
public class BubbleSort {
	
	/**
	 * Method for bubble sort algorithm
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	//print method
	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t ");
		}
	}

	
	/**
	 * Main method that 
	 * prints array before sorting
	 * sort them and 
	 * prints array after sorting
	 * @param args unused
	 */
	public static void main(String[] args) {

		int[] arr = { 36, 89, 45, 77, 63, 32 };

		System.out.println("Arry Before Sorting:");
		BubbleSort bs = new BubbleSort();
		bs.printArray(arr);
		BubbleSort bs1 = new BubbleSort();
		bs1.bubbleSort(arr);
		System.out.println("\n");
		System.out.println("Sorted array");
		bs1.printArray(arr);
	}
}

package com.vin.test.searching;

public class LinearSearch {
	/*
	 * In Linear search we iterate through the given array and compare every
	 * element in the array to the searchable value if its equal we return the
	 * index if none of the values are matched to the given value in the array
	 * then -1 will be returned
	 */
	public int search(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}

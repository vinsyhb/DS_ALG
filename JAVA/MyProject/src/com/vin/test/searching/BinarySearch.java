package com.vin.test.searching;

public class BinarySearch {
	/**
	 * Binary search is used for the sorted array. Given array will be divided
	 * into two parts middle is chosen by ( startIndex + endIndex ) / 2 if the
	 * middle is smaller than the searchable value then search from middle+1 to
	 * end recursively otherwise search from start to middle -1 recursively
	 */
	public int search(int[] array, int start, int end, int value) {
		int mid = start + end / 2;
		if (array[mid] > value) {
			return search(array, start, mid, value);
		} else if (array[mid] < value) {
			return search(array, mid + 1, end, value);
		} else if (array[mid] == value) {
			return mid;
		}
		return -1;
	}

}

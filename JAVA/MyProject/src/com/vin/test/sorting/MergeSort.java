package com.vin.test.sorting;

public class MergeSort {
	public void mergeSort(int[] array, int start, int end) {
		int mid = start + end / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, end, mid);
	}

	private void merge(int[] array, int start, int end, int mid) {
		int leftArrayLength = mid - start + 1;
		int rightArrayLength = end - mid;
		int[] leftArray = new int[leftArrayLength + 1];
		int[] rightArray = new int[rightArrayLength + 1];
		// copy to left array
		for (int i = 0; i < leftArrayLength; i++) {
			leftArray[i] = array[start + 1];
		}
		for (int j = 0; j < rightArrayLength; j++) {
			rightArray[j] = array[mid + 1 + j];
		}
		int index = start;
		int j = 0;
		int i = 0;
		while (i < leftArrayLength && j < rightArrayLength) {
			if (leftArray[i] <= rightArray[j]) {
				array[index] = leftArray[i];
				i++;
				index++;
			} else {
				array[index] = rightArray[j];
				j++;
				index++;
			}
		}
		if (i < leftArrayLength) {
			while (i < leftArrayLength) {
				array[index] = leftArray[i];
				i++;
				index++;
			}
		}
		if (j < rightArrayLength) {
			while (j < rightArrayLength) {
				array[index] = rightArray[j];
				j++;
				index++;
			}
		}

	}
}

package com.vin.test.sorting;

//Java program for implementation of QuickSort
public class QuickSort
{
	/* This function takes last element as pivot,
	places the pivot element at its correct
	position in sorted array, and places all
	smaller (smaller than pivot) to left of
	pivot and all greater elements to right
	of pivot */
	public void quickSort(int[] array, int start, int end){
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1);
		quickSort(array, pivot+1, end);
	}

	private int partition(int[] array, int start, int end){
		int j=start;
		for(int i= start;i<end;i++){
			if( array[i] < array[end] ){
				swap(array[i], array[j]);
				j++;
			}
		}
		swap(array[j], array[end]);
		return j;
	}
	private void swap(int a, int b){
		int temp = a;
		a= b;
		b=temp;
	}
}
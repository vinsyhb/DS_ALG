package com.vin.test.array;

public class MaxSumIncreasingSubSequence {
	public static void main(String s[]) {
		int[] arr = {1,100,2,3,102,4,5};
		int sum = 0;
		int finalSum= 0;
		int n = arr.length;
		int msis[] = new int[n];
		 
        /* Initialize msis values for all indexes */
        for ( int i = 0; i < n; i++ )
            msis[i] = arr[i];
 
        /* Compute maximum sum values in bottom up manner */
        for ( int i = 1; i < n; i++ ){

        	for ( int j = 0; j < i; j++ ){
            
        		if ( arr[i] > arr[j] && msis[i] < msis[j] + arr[i]){
                	msis[i] = msis[j] + arr[i];
                }
        		
            }
        	
        }
		System.out.println("finalSum"+finalSum);
	}
}

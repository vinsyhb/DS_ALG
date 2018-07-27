package com.vin.test.array;

public class AllPairsWithGivenSum {

	public void getPairs(int[] arr, int K){
		int start = 0;
		int end = arr.length;
		 
		while (start <= end)
		{
		    int sum = arr[start] + arr[end];
		    if (sum == K)
		    {
		        System.out.println ("Found sum for " + arr[start] + " and " + arr[end]);
		        start++;
		        end--;
		    }
		    else if (sum < K)
		    {
		        start++;
		    }
		    else
		    {
		        end--;
		    }
		}
	}
}

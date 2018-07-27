package com.vin.test.array;

class RainWaterTrapping {
    public static void main(String args[]) throws Exception {
         
        int[] arr = {1,4,2,5,0,6,2,3,4};
        int n = arr.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
         
        left[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
         
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
         
        int total = 0;
        for(int i=0; i<n; i++)
        {
            total += Math.min(left[i],right[i]) - arr[i];
        }
        System.out.println(total);
    }
}
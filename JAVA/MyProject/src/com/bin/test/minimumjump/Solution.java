package com.bin.test.minimumjump;

public class Solution {
    public int jump(int[] A) {
        if (A.length <= 1)
            return 0;
        int ladder = A[0];
        int stairs = A[0];
        int jump = 1;
        for (int i = 1; i < A.length; i++) {
           if (i == A.length - 1)
                return jump;
            if ( i + A[i] > ladder)
                ladder = i + A[i];
            stairs--;
            if (stairs == 0) {
                jump++;
                stairs = ladder - i;
            }
        }
        return jump;
    }
}
package com.leetcode;

import java.lang.reflect.Array;

class MergeSort {
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]

	 void merge(int A[], int m, int B[], int n) {
        int insertIndex = m+n-1;
        int indexA = m-1,indexB = n-1;
        
        while(indexB>=0){
            if(indexA<0){
                A[insertIndex--] = B[indexB--];
            }else{
                if(B[indexB]>=A[indexA]){
                    A[insertIndex--] = B[indexB--];
                }else{
                    A[insertIndex--] = A[indexA--];
                }
            }
        }
    }







	// Driver code
	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		

		MergeSort ob = new MergeSort();
		ob.merge(arr, 0, arr, 0);

		

		System.out.println("\nSorted array");
		System.out.println(ob);
	}
}
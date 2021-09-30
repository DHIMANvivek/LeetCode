package com.leetcode;

import java.util.Arrays;

public class IntersectionOfTwoNumbers {

	public static int[] intersect(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0, j = 0, k = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] < nums2[j])
				i++;
			else if (nums2[j] < nums1[i])
				j++;
			else {

				nums1[k++] = nums1[i];
				++i;
				++j;

			}

		}

		int[] ans1 = new int[k];
		for (i = 0; i < k; i++) 
			for (j = 0; j < k; j++) {
			ans1[i] = nums1[i];
			ans1[j] = nums2[j];
		}

		return ans1;

	}

	public static void main(String[] args) {

		{
			int[] nums1 = { 1, 2, 2, 1, 45, 55 };
			int[] nums2 = { 2, 2, 45, 56, 56, 66, 555 };
			int[] ans = intersect(nums1, nums2);
			for (int x : ans)
				System.out.print(x + " ");
		}
	}
}

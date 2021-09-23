   
package com.leetcode;

// syntax is not true as there is no main method
// this only for my reference :)


// this is the question of leet code 

// Problem :- Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0 ; i <  nums.length  ; i++ )
            for(int j = i+1 ; j < nums.length ; j++)
            if(target -nums[j] == nums[i])
                return new int[] {i,j};
        
        return null;
         }

     }
	
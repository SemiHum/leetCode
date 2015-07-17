package com.avalontm.leetcode._217ContainsDuplicate;

import java.util.HashSet;

/**
 * 217.Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * <p/>
 * Created by jiang_s on 2015/7/17.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> exists = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(!exists.add(nums[i]))
                return true;
        }
        return false;
    }
}

package com.avalontm.leetcode._27RemoveElement;

/**
 * 27.Remove Element
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Created by jiang_s on 2015/7/17.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else if (offset > 0) {
                nums[i - offset] = nums[i];
            }
        }
        return nums.length - offset;
    }
}

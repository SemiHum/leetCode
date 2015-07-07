package com.avalontm.leetcode._219ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Given an array of integers and an integer k, find out whether there there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the difference
 * between i and j is at most k.
 * <p/>
 * Created by jiang_s on 2015/7/3.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}

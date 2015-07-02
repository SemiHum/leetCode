package com.avalontm.leetcode._198HouseRobber;

/**
 * 198. House Robber
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing
 * each of them is that adjacent houses have security system connected and it will automatically
 * contact the police if two adjacent houses were broken into on the same night.
 * <p/>
 * Given a list of non-negative integers representing the amount of money of each house, determine
 * the maximum amount of money you can rob tonight without alerting the police.
 * Created by jiang_s on 2015/7/2.
 */
public class Solution {
    /**
     * Recursive Version
     */
    public int rob(int[] nums) {
        int[] cache = new int[nums.length];
        int cacheSize = cache.length;
        for (int i = 0; i < cacheSize; i++) {
            cache[i] = -1;
        }
        return rob(nums, 0, cache);
    }

    public int rob(int[] nums, int start, int[] cache) {
        int left = nums.length - start;
        if (left < 1) {
            return 0;
        }
        if (left == 1) {
            return nums[nums.length - 1];
        }
        if (cache[start] != -1) {
            return cache[start];
        }
        int result = Math.max(nums[start] + rob(nums, start + 2, cache), nums[start + 1] + rob(nums, start + 3, cache));
        cache[start] = result;
        return result;
    }
}

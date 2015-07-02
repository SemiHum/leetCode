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
public class Solution2 {
    /**
     * Dynamic Programming Version
     */
    public int rob(int[] nums) {
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i % 2 == 1) {
                x = Math.max(x + nums[i], y);
            } else {
                y = Math.max(y + nums[i], x);
            }
        }
        return Math.max(x, y);
    }
}

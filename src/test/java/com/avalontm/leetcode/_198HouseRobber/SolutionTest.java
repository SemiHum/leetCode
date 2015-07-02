package com.avalontm.leetcode._198HouseRobber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void test1House() throws Exception {
//        Assert.assertEquals(12, solution.rob(new int[]{12}));
//        Assert.assertEquals(3, solution.rob(new int[]{1, 3, 1}));
//        Assert.assertEquals(4, solution.rob(new int[]{2, 3, 2}));
//        Assert.assertEquals(3, solution.rob(new int[]{3, 1}));
//        Assert.assertEquals(0, solution.rob(new int[]{0, 0, 0}));
        Assert.assertEquals(0, solution.rob(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
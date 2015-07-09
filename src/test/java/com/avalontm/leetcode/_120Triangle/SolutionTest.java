package com.avalontm.leetcode._120Triangle;

import com.google.common.collect.Lists;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by jiang_s on 2015/7/9.
 */
public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void test1() throws Exception {
        List<Integer> row1 = Lists.newArrayList(1);
        List<Integer> row2 = Lists.newArrayList(2, 3);
        Assert.assertEquals(3, solution.minimumTotal(Lists.newArrayList(row1, row2)));
    }

    @Test
    public void test2() throws Exception {
        List<Integer> row1 = Lists.newArrayList(-1);
        List<Integer> row2 = Lists.newArrayList(3, 2);
        List<Integer> row3 = Lists.newArrayList(-3, 1, -1);
        Assert.assertEquals(-1, solution.minimumTotal(Lists.newArrayList(row1, row2, row3)));
    }
}
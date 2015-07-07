package com.avalontm.leetcode._219ContainsDuplicateII;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by jiang_s on 2015/7/3.
 */
public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void test1() throws Exception {
        assertTrue(solution.containsNearbyDuplicate(new int[]{1, 1}, 1));
    }

    @Test
    public void test2() throws Exception {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2, 1}, 0));
    }

    @Test
    public void test3() throws Exception {
        assertFalse(solution.containsNearbyDuplicate(new int[]{4, 1}, 3));
    }

    @Test
    public void test4() throws Exception {
        assertTrue(solution.containsNearbyDuplicate(new int[]{4, 1, 3, 1, 5}, 3));
    }

    @Test
    public void test5() throws Exception {
        assertTrue(solution.containsNearbyDuplicate(new int[]{4, 1, 2, 3, 1, 5}, 3));
    }

    @Test
    public void test6() throws Exception {
        assertFalse(solution.containsNearbyDuplicate(new int[]{1, 2}, 2));
    }
}
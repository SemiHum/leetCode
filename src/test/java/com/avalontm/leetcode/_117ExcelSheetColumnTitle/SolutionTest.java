package com.avalontm.leetcode._117ExcelSheetColumnTitle;

import junit.framework.TestCase;
import org.junit.Before;

/**
 * 117. Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p/>
 * For example:
 * <p/>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * Created by jiang_s on 2015/7/2.
 */
public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @org.junit.Test
    public void test1() throws Exception {
        TestCase.assertEquals(solution.convertToTitle(1), "A");
        TestCase.assertEquals(solution.convertToTitle(2), "B");
        TestCase.assertEquals(solution.convertToTitle(2), "C");
        TestCase.assertEquals(solution.convertToTitle(26), "Z");
        TestCase.assertEquals(solution.convertToTitle(27), "AA");
        TestCase.assertEquals(solution.convertToTitle(28), "AB");
    }
}
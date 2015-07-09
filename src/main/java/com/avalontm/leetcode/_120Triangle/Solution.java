package com.avalontm.leetcode._120Triangle;

import java.util.List;

/**
 * 120. Triangle
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 * <p/>
 * For example, given the following triangle
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * <p/>
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 * <p/>
 * Created by jiang_s on 2015/7/9.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        if (size == 1) {
            return triangle.get(0).get(0);
        }
        int[] current = new int[size];
        int[] last = new int[size];
        for (int i = 0; i < size; i++) {
            last[i] = triangle.get(size - 1).get(i);
        }
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                current[j] = Math.min(last[j], last[j + 1]);
                current[j] += triangle.get(i).get(j);
            }
            int[] temp = current;
            current = last;
            last = temp;
        }
        return last[0];
    }
}

package com.avalontm.leetcode._96UniqueBinarySearchTrees;

import java.util.HashMap;
import java.util.Map;

/**
 * 96. Unique Binary Search Trees
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * <p/>
 * 1         3     3      2      1
 * \       /     /      / \      \
 * 3     2     1      1   3      2
 * /     /       \                 \
 * 2     1         2                 3
 * <p/>
 * Created by jiang_s on 2015/7/8.
 */
public class Solution {
    Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int numTrees(int n) {
        if (n == 0)
            return 1;
        if (n == 1) {
            return 1;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numTrees(i) * numTrees(n - 1 - i);
        }
        cache.put(n, sum);
        return sum;
    }
}

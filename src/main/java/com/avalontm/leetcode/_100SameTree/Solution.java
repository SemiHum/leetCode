package com.avalontm.leetcode._100SameTree;

/**
 * 100. Same Tree
 * Given two binary trees, write a function to check if they are equal or not.
 * <p/>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * Created by jiang_s on 2015/7/17.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

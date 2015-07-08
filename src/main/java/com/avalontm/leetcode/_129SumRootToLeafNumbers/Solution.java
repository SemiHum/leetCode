package com.avalontm.leetcode._129SumRootToLeafNumbers;

/**
 * 129.	Sum Root to Leaf Numbers
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * Find the total sum of all root-to-leaf numbers.
 * For example,
 * 1
 * / \
 * 2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Return the sum = 12 + 13 = 25.
 * <p/>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * <p/>
 * Created by jiang_s on 2015/7/7.
 */
public class Solution {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        visit(root, 0);
        return sum;
    }

    private void visit(TreeNode root, int last) {
        int val = last * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += val;
            return;
        }
        if (root.left != null) {
            visit(root.left, val);
        }
        if (root.right != null) {
            visit(root.right, val);
        }
    }
}

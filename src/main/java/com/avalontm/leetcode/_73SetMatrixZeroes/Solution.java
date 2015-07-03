package com.avalontm.leetcode._73SetMatrixZeroes;

/**
 * 73.Set Matrix Zeroes
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * <p/>
 * Follow up:
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 * <p/>
 * Created by jiang_s on 2015/7/2.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean is1stRow0 = false, is1stCol0 = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                is1stCol0 = true;
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                is1stRow0 = true;
                break;
            }
        }
        if (matrix.length > 1 && matrix[0].length > 0) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 1; i < matrix[0].length; i++) {
                if (matrix[0][i] == 0) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[j][i] = 0;
                    }
                }
            }
        }
        if (is1stCol0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (is1stRow0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}

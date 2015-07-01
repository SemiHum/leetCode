package com.avalontm.leetcode._117ExcelSheetColumnTitle;

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
 * Created by jiang_s on 2015/7/1.
 */
public class Solution {
    int maxCharSize = 0;
    char[] alphabet = new char[26];

    public Solution() {
        maxCharSize = (int) Math.ceil(Math.log(Integer.MAX_VALUE) / Math.log(26));
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
        }
    }

    public String convertToTitle(int n) {
        char[] chars = new char[maxCharSize];
        int mod = n;
        int index = maxCharSize;
        while (mod > 0) {
            chars[index - 1] = alphabet[(mod - 1) % 26];
            mod = (mod - 1) / 26;
            index--;
        }
        return new String(chars, index, maxCharSize - index);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.convertToTitle(27));
    }
}

package com.avalontm.leetcode._205IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p/>
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * <p/>
 * Note:
 * You may assume both s and t have the same length.
 * Created by jiang_s on 2015/7/17.
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        Map<Character, Character> rCharMap = new HashMap<Character, Character>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            Character destChar = charMap.get(charS);
            Character rDestchar = rCharMap.get(charT);
            if (destChar == null && rDestchar == null) {
                charMap.put(charS, charT);
                rCharMap.put(charT, charS);
            } else {
                if (destChar == null) {
                    return false;
                }
                if (!destChar.equals(charT))
                    return false;
            }
        }
        return true;
    }
}

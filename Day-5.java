/*
 * 5. Longest Palindromic Substring
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

 class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > result.length()) {
                    result = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
            left = i; right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > result.length()) {
                    result = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }
        return result;
    }
}

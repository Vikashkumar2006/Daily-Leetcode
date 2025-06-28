/*
 * 3. Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
 */



 class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=start;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    start=j+1;
                    break;
                }
            }
        max=Math.max(max,i-start+1);
        }
        return max;
    }
}
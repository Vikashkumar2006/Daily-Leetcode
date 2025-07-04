/*
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
 */



 import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int place=0;
        while(place<s1.length() && place<s2.length())
        {
            if(s1.charAt(place)==s2.charAt(place))
            {
                place++;
            }
            else
                break;
        }
        return s1.substring(0,place);
    }
}
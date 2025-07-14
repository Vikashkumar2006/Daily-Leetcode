/*
 * 58. Length of Last Word
Solved
Easy
Topics
premium lock icon
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */


 class Solution {
    public int lengthOfLastWord(String s) {
        int max=0;
        int sum=0;
        int z=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                sum=sum+1;
            else if(sum!=0){
            max=sum;
            sum=0;
            }
        }
        if(sum!=0)
            max=sum;
        return max;
    }
}
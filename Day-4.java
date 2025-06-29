/*
 * 4. Median of Two Sorted Arrays
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106

 */

 import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int merge[] = new int[l1 + l2];
        double median;
        for (int i = 0; i < nums1.length; i++) {
            merge[i] = nums1[i];
        }
        for (int j = 0; j < l2; j++) {
            merge[l1 + j] = nums2[j];
        }
        Arrays.sort(merge);
        if (merge.length % 2 == 0) {
            int l = merge.length / 2;
            median = (merge[l] + merge[l - 1]) / 2.0;
        } else {
            int l = merge.length / 2;
            median = merge[l];
        }
        return median;
    }
}
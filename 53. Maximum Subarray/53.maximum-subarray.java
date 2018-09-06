/*
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (41.09%)
 * Total Accepted:    358.9K
 * Total Submissions: 873K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {
        // dp
        // storage[i] is the max value end with nums[i]
        // int[] storage = new int[nums.length];
        // int maxValue = storage[0] = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     storage[i] = Math.max(nums[i], nums[i] + storage[i-1]);
        //     maxValue = Math.max(storage[i], maxValue);
        // }
        // return maxValue;

        // dp
        // no need to storage every cal
        int maxValue = nums[0];
        int sum = maxValue;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            maxValue = Math.max(sum, maxValue);
        }
        return maxValue;
    }
}

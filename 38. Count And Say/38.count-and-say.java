/*
 * [38] Count and Say
 *
 * https://leetcode.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (37.73%)
 * Total Accepted:    216.4K
 * Total Submissions: 573.3K
 * Testcase Example:  '1'
 *
 * The count-and-say sequence is the sequence of integers with the first five
 * terms as following:
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * 
 * 
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * 
 * 
 * 
 * Note: Each term of the sequence of integers will be represented as a
 * string.
 * 
 * 
 * Example 1:
 * 
 * Input: 1
 * Output: "1"
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 4
 * Output: "1211"
 * 
 * 
 */
class Solution {
    public String countAndSay(int n) {
        if (1 == n) {
            return "1";
        }

        String pre = countAndSay(n - 1);
        char cur = pre.charAt(0);
        int count = 0;
        // cal repeat count
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < pre.length(); j++) {
            if (pre.charAt(j) == cur) {
                count++;
            } else {
                sb.append(count).append(cur);
                cur = pre.charAt(j);
                count = 1;
            }
        }
        sb.append(count).append(cur);
        return sb.toString();
    }
}

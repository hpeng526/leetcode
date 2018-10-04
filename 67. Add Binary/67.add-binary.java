/*
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (35.87%)
 * Total Accepted:    235.1K
 * Total Submissions: 655.2K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int pa = a.length() - 1;
        int pb = b.length() - 1;
        int carry = 0;
        while (pa >= 0 || pb >= 0) {
            char ta = pa < 0 ? '0' : a.charAt(pa--);
            char tb = pb < 0 ? '0' : b.charAt(pb--);
            int sum = (ta + tb) % '0' + carry;
            result = (sum % 2) + result;
            carry = sum / 2;
            //System.out.println(ta + " " + tb + " " + sum + " " + carry + "=" + result);
        }
        return carry == 1 ? "1" + result : result;
    }
}

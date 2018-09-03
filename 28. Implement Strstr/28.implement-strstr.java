/*
 * [28] Implement strStr()
 *
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * algorithms
 * Easy (29.81%)
 * Total Accepted:    309.5K
 * Total Submissions: 1M
 * Testcase Example:  '"hello"\n"ll"'
 *
 * Implement strStr().
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * Example 1:
 * 
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 
 * Clarification:
 * 
 * What should we return when needle is an empty string? This is a great
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we will return 0 when needle is an empty
 * string. This is consistent to C's strstr() and Java's indexOf().
 * 
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int srcCount = haystack.length();
        int dstCount = needle.length();
        // the max length need to be search
        int max = srcCount - dstCount;

        if (dstCount == 0) {
            return 0;
        }

        if (srcCount < dstCount) {
            return -1;
        }

        char first = needle.charAt(0);

        for (int i = 0; i < srcCount; i++) {
            // look for first
            if (haystack.charAt(i) != first) {
                while(++i <= max && haystack.charAt(i) != first);
            }

            // found first, rest of
            if (i <= max) {
                int j = i + 1;
                int end = j + dstCount - 1;
                
                // needle k
                // haystack j
                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); k++, j++);

                // found needle
                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }
}

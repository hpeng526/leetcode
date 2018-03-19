class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        for (int i=0; i<strs[0].length(); i++) {
            char cur = strs[0].charAt(i);
            for (int j=1; j<strs.length; j++) {
                if (strs[j].charAt(i) != cur) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
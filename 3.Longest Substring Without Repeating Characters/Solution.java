public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.clear();
        int n = s.length(), maxLen = 0;
        for(int i=0, j=0; j<n; j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            maxLen = Math.max(maxLen, j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return maxLen;
    }
    
}
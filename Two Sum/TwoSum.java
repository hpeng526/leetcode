public class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] ans = {0, 0};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.clear();
        for(int i=0; i<nums.length; i++) {
        	map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
        	if(map.containsKey(target - nums[i])) {
        		ans[0] = i;
        		ans[1] = map.get(target - nums[i]);
        		if(ans[0] == ans[1]) {
        			continue;
        		}
        		break;
        	}
        }
        return ans;
    }
}
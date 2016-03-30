class Solution(object):
    def twoSum(self, nums, target):
        num_dict = {}
        for i, x in enumerate(nums):
            num_dict[x] = i
        for i, x in enumerate(nums):
            if target - x in num_dict:
                if i == num_dict[target - x] :
                    continue
                return (i, num_dict[target - x])

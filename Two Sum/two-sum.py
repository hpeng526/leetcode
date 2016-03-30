class Solution(object):
    def twoSum(self, nums, target):
        num_dict = {}
        for i, x in enumerate(nums):
            if target - x in num_dict:
                return (num_dict[target - x], i)
            num_dict[x] = i

if __name__ == '__main__':
    print "index1=%d, index2=%d" % Solution().twoSum((3, 2, 4), 6)

func twoSum(nums []int, target int) []int {
    var m map[int]int
    m = make(map[int]int)
    for i := 0; i < len(nums); i++ {
        val, exist := m[target - nums[i]]
        if exist {
            return []int{val, i}
        }
        m[nums[i]] = i
    }
    return []int{0, 0}
}
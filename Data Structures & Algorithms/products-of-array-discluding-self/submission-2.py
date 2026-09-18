class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod = 1
        zerocount = 0
        for i in nums:
            if i != 0:
                prod *= i
            else:
                zerocount += 1
        
        if zerocount > 1:
            return [0] * len(nums)

        for i in range(len(nums)):
            if nums[i] == 0:
                result = [0] * len(nums)
                result[i] = prod
                return result
            nums[i] = int(prod / nums[i])
        return nums

        
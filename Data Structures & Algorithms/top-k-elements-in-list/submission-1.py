from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        for i in nums:
            freq_map[i] = freq_map.get(i, 0) + 1

        freq_list = [[] for i in range(len(nums) + 1)]
        for key, value in freq_map.items():
            freq_list[value].append(key)

        count = 0
        res = []
        for i in reversed(freq_list):
            for j in i:
                res.append(j)
                count += 1
                if count == k:
                    return res

        return res
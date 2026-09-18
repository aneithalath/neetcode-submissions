class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights)-1
        max = 0
        while (l < r):
            print(f"{l} {r}")
            max_temp = min(heights[l], heights[r]) * (r - l)
            if max_temp > max:
                max = max_temp
            if (heights[l] < heights[r]):
                l+=1
            else:
                r-=1

        return max
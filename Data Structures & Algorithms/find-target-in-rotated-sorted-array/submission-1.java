class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r-l)/2;
            
            if (nums[m] == target) return m;

            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int p = l;
        l = 0;
        r = nums.length - 1;
        if (nums[p] <= target && target <= nums[r]) {
            l = p;
        } else {
            r = p - 1;
        }

        while (l <= r) {
            int m = l + (r-l)/2;
            
            if (nums[m] == target) return m;

            else if (nums[m] > target) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return -1;

    }
}

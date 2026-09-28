class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        int min=0;

        while (l < r) {
            int m = l + (r-l)/2; 
            

            if (nums[r] < nums[m]) {
                l = m + 1;
                min = nums[r];
                continue;
            } else {
                r = m;
                min = nums[r];
                continue;
            }
        }

        return min;
    }
}

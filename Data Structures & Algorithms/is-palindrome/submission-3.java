class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.toCharArray();

        int l = 0;
        int r = sArr.length - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(sArr[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(sArr[r])) {
                r--;
                continue;
            }

            if (Character.toLowerCase(sArr[l]) != Character.toLowerCase(sArr[r])) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}

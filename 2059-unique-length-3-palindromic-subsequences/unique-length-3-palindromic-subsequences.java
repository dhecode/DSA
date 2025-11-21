class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);
            if (left != -1 && right != -1 && right - left > 1) {
                boolean[] uniqueInBetween = new boolean[26];
                for (int i = left + 1; i < right; i++) {
                    uniqueInBetween[s.charAt(i) - 'a'] = true;
                }
                for (boolean exists : uniqueInBetween) {
                    if (exists) result++;
                }
            }
        }
        return result;
    }
}

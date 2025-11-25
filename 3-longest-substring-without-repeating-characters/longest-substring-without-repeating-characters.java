class Solution {
    public int lengthOfLongestSubstring(String s) {
        // twosum
        int left = 0 ;
        int right = 0 ;
        int max = 0 ;
        Set<Character> a = new HashSet<>();
        while(left<s.length())
        {
           if(!a.contains(s.charAt(left)))
           {
            a.add(s.charAt(left));
            left++;
            max = Math.max(max,a.size());
           }
           else
           {
            a.remove(s.charAt(right++));
           }
        }
        return max;
    }
}
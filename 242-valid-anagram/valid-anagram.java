class Solution {
    public boolean isAnagram(String s, String t) {
       char a[] = s.toCharArray();//String is immutabel cannot use directly
       char b[] = t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       return String.valueOf(a).equals(String.valueOf(b));
    }

}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.contains(ransomNote)|| check(ransomNote,magazine))
        {
            return true ;
        }
        return false;
    }

    public boolean check(String ram,String mag)
   {
    Map<Character,Integer> a = new HashMap<>();
    Map<Character,Integer> b = new HashMap<>();
    char x[] = ram.toCharArray();
    char y[] = mag.toCharArray();
    for(char c:x)
    { 
        if(a.containsKey(c))
    {
        a.put(c,a.get(c)+1);
    }
       else{
         a.put(c,1);
       }
    }
    for(char c:y)
    { 
        if(b.containsKey(c))
    {
        b.put(c,b.get(c)+1);
    }
       else{
         b.put(c,1);
       }
    }
   
      for (Map.Entry<Character,Integer> e : a.entrySet()) {
            char ch = e.getKey();
            int need = e.getValue();
            int have = b.getOrDefault(ch, 0);
            if (have < need) {
                return false;
            }
        }
        return true;
  }

    
}


// for (char c : strArray) {
//             if (charCountMap.containsKey(c)) {

//                 // If char is present in charCountMap,
//                 // incrementing it's count by 1
//                 charCountMap.put(c, charCountMap.get(c) + 1);
//             }
//             else {

//                 // If char is not present in charCountMap,
//                 // putting this char to charCountMap with 1 as it's value
//                 charCountMap.put(c, 1);
//             }
// }
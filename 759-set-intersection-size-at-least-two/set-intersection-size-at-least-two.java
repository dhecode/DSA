import java.util.*;
// using greedy algo solved by Utkarsh
// basic greedy approach 
class Solution {
    public int intersectionSizeTwo(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );
        
        int a = -1, b = -1; 
        int count = 0;
        
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            boolean hasA = (a >= start && a <= end);
            boolean hasB = (b >= start && b <= end);
            
            if (hasA && hasB) {
                continue;
            } 
            else if (hasB) {
                a = b;
                b = end;
                count++;
            } 
            else {
                a = end - 1;
                b = end;
                count += 2;
            }
        }
        
        return count;
    }
}
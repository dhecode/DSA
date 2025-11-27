class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums3 []= new int[m+n];
        int k=0;
    
        for(int i=0;i<m;i++)
        {
          
            nums3[i] = nums1[i];
            k =i;
            

        }
        for(int j=0;j<n;j++)
        { 
        nums3[m+j] = nums2[j];

        }
        
         for(int i=0;i<m+n;i++)
        {
          
            nums1[i] = nums3[i];
            

        }
        Arrays.sort(nums1);
    }
}
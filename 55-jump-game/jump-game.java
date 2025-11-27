class Solution {
    public boolean canJump(int[] nums) {
        int maxreach = nums[0];
        for(int i =1 ;i<nums.length;i++)
        {
            if(maxreach<i)
            {
                return false;
            }
            maxreach = Math.max(maxreach,i+nums[i]);
            if(maxreach>=nums.length-1)
            {
                return true;
            }
        }
        return true;
    }
}
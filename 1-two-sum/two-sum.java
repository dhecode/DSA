class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] original = nums.clone();
        Arrays.sort(nums);
        
        int left = 0, right = nums.length - 1;
        int[] result = new int[2];
        
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum < target) left++;
            else if(sum > target) right--;
            else {
                // Find original index of nums[left]
                for(int i = 0; i < original.length; i++) {
                    if(original[i] == nums[left]) {
                        result[0] = i;
                        break;
                    }
                }
                // Find original index of nums[right], start after result[0]
                for(int i = 0; i < original.length; i++) {
                    if(original[i] == nums[right] && i != result[0]) {
                        result[1] = i;
                        break;
                    }
                }
                break;
            }
        }
        return result;
    }
}

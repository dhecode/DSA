class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n]; // Storing prefix sums
        long ans = Long.MIN_VALUE;  // Initialize answer with smallest possible value

        // Calculate prefix sums
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Iterate through each of the k starting points
        for (int i = 0; i < k; i++) {
            long sum = 0, maxSum = Long.MIN_VALUE;

            // Process subarrays in the current group
            for (int ind = i + k - 1; ind < n; ind += k) {
                // Calculate the sum of the last k elements using prefix sums
                long subarraySum = prefix[ind];
                if (ind - k >= 0) {
                    subarraySum -= prefix[ind - k];
                }

                // Kadane's algorithm: Add current subarray sum and track maximum
                sum += subarraySum;
                maxSum = Math.max(maxSum, sum);

                // Reset sum to 0 if it goes negative
                if (sum < 0) {
                    sum = 0;
                }
            }

            // Update global maximum sum
            ans = Math.max(ans, maxSum);
        }

        return ans;
    }
}
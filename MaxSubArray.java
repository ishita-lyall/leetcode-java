class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = -2147483648;
        for(int i=0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum<0){
                currentSum = 0;
            }
        }
return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxSum = -2147483648;
//         for(int i = 0;i<nums.length;i++){
//             int currentSum = 0;
//             for(int j=i;j<nums.length;j++){
//                 currentSum = currentSum + nums[j];
//                 maxSum = Math.max(currentSum, maxSum);
//             }
//         }
//         return maxSum;
//     }
// }

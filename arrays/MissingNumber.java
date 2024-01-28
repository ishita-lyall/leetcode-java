class MissingNumber {
    public int missingNumber(int[] nums) {
        int hash[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]] = 1;
        }
        for(int i=0;i<nums.length;i++){
            if(hash[i]!=1){
                return hash[i];
            }
        }        
return 0;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int sum = n*(n+1)/2;
//         int numsSum = 0;
//         for(int i=0;i<nums.length;i++){
//             numsSum = numsSum + nums[i];
//         } 
//         return sum - numsSum;
//     }
//range [0,n] with one number missing
// }

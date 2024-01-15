class LongestOnes {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int result = 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==0){
                count++;
            }            
            while(count>k){
             if(nums[j]==0){
                count--;
            }
            j++;               
            }
            result = Math.max(i-j+1, result);
        }
       return result; 
    }
}

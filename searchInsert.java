class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=1;
        int i=0;
        while(n<nums.length){
            if(nums[i]==target){
                return i;
            }
            else if(nums[0]>target){
                return 0;
            }
            else if(nums[i]<target && nums[n]>=target){
                return n;
            }
            else if(target>nums[nums.length-1]){
                return nums.length;
            }
            n++;
            i++;
        }
        if(target<=nums[0]){
            return 0;
        }
return 1;
        
    }
}

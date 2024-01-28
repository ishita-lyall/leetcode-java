public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        int i=0;
        if(i<n){
        int temp = nums[i];
        nums[i] = nums[n-1];
        nums[n-1] = temp;
        i++;
        reverseArray(n-1, nums);
        }
        return nums;

        }
}

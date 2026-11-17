class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] backward = new int[nums.length];
        backward[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2 ; i >= 0; i--)
            backward[i] = backward[i+1] * nums[i];
        
        backward[0] = backward[1];

        for (int i = 1; i < backward.length-1 ; i++){
            backward[i] = backward[i+1] * nums[i-1];
            nums[i] = nums[i] * nums[i-1];
        }

        backward[nums.length-1] = nums[nums.length-2];
        return backward;

    }
}  

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        int leftsum=0;
        int ans[]=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int rightsum=totalsum-leftsum-nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];

        }
        return ans;
        
    }
}
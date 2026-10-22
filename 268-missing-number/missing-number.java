class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        int acutalsum=0;
        for(int i=0;i<n;i++){
            acutalsum=acutalsum+nums[i];
        }
        return expectedsum-acutalsum;
    }
}
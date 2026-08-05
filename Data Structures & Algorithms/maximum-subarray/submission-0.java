class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum=sum<0?0:sum;
            sum+=num;
            ans=Math.max(ans, sum);
        }
        return ans;
    }
}

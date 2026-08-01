class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start);
            min = Math.min(min, nums[mid]);
            if(nums[mid]>nums[end]) start=mid+1;
            else end=mid-1;
        }return min;
    }
}

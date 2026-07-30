class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        if(nums.length==0) return 0;
        for(int num:nums){
            s.add(num);
        }
        int ans=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int start=num;
                int count=1;
                while(s.contains(start+1)){
                    start++;
                    count++;
                }ans = Math.max(ans, count);
            }
        }return ans;
    }
}

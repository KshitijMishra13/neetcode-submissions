class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, target, ans, new ArrayList<>(), 0);
        return ans;
    }
    public void backtrack(int[] nums, int rem, List<List<Integer>> ans, List<Integer> temp, int index){
        if(rem==0){
            ans.add(new ArrayList<>(temp));
            return;
        }if(rem<0) return;
        for(int i=index; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(nums, rem-nums[i], ans, temp, i);
            temp.remove(temp.size()-1);
        }
    }
}

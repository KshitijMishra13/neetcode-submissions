class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int ans=0;
        for(int p:prices){
            if(p<min){
                min=p;
            }
            ans = Math.max(ans, p-min);
        }return ans;
    }
}

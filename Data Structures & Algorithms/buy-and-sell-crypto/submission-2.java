class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int minBuy=prices[0];
        for(int sell:prices){
            ans = Math.max(ans, sell-minBuy);
            minBuy = Math.min(minBuy, sell);
        }return ans;
    }
}

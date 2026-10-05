class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int profit = 0;
        int maxProfit = 0;
        for(int right = 1; right < prices.length; right++){
            profit = prices[right] - prices[left];
            while(prices[right] < prices[left]){
                left = right;
            }
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}

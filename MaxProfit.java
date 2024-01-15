class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int cost = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}

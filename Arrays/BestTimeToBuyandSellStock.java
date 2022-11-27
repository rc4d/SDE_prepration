package Arrays;
public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i]< min){
                min = prices[i];
            }else{
                maxProfit = Math.max(prices[i] - min, maxProfit);
            }
        }
        return maxProfit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
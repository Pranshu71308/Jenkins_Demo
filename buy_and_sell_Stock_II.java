public class buy_and_sell_Stock_II {
    public int maxprofit1(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = {1,3,6,4,8,9};
        buy_and_sell_Stock_II bs1 = new buy_and_sell_Stock_II();
        System.out.println(bs1.maxprofit1(prices));
    }
}

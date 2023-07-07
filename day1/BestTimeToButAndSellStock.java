package day1;
import java.util.*;
public class BestTimeToButAndSellStock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        System.out.println("Prices on ith day : ");
        int[] prices = new int[n];
        for(int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }
        System.out.println("Max Profit : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices)
    {
        int maxFromLast = prices[prices.length-1];
        int profit = 0;
        for(int i = prices.length-2; i >= 0; i--)
        {
            if(prices[i] > maxFromLast)
                maxFromLast = prices[i];
            else
                profit = Math.max(profit, maxFromLast-prices[i]);
        }
        return profit;
    }
}
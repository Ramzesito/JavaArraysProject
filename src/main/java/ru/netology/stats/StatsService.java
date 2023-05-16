package ru.netology.stats;

public class StatsService {

    public long getSalesSum(long[] sales){
        long sum = 0;
        for (long s: sales) {
            sum = sum + s;
        }
        return sum;
    }

    public long getAverageSalesSum(long[] sales){
        return getSalesSum(sales)/sales.length;
    }

    public int getMonthOfMaxSales(long[] sales){
        int maxMonth = 0;
        for (int i=0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]){
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMonthOfMinSales(long[] sales){
        int minMonth = 0;
        for (int i=0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]){
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMonthCountOfSalesBottomAverage(long[] sales){
        int monthCount = 0;
        long average = getAverageSalesSum(sales);
        for (long s: sales) {
            if (s < average){
                monthCount++;
            }
        }
        return monthCount;
    }

    public int getMonthCountOfSalesUpperAverage(long[] sales){
        int monthCount = 0;
        long average = getAverageSalesSum(sales);
        for (long s: sales) {
            if (s > average){
                monthCount++;
            }
        }
        return monthCount;
    }

}

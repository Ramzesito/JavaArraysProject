package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    //long[] sales1 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    //@ParameterizedTest
    //@CsvFileSource(files="src/main/resources/sales.csv")
    @Test
    public void shouldGetSalesSum(){
        long[] sales = {234, 670, 3333, 344, 670, 453, 6554, 1122, 786, 988};
        long expected = 15154;
        StatsService service = new StatsService();
        long actual = service.getSalesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageSalesSum(){
        long[] sales = {234, 670, 3333, 344, 670, 453, 6554, 1122, 786, 988};
        long expected = 1515;
        StatsService service = new StatsService();
        long actual = service.getAverageSalesSum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthOfMaxSales(){
        long[] sales = {333, 444, 555, 555, 444, 333, 111, 111, 555, 444, 555, 444};
        int expected = 11;
        StatsService service = new StatsService();
        int actual = service.getMonthOfMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthOfMinSales(){
        long[] sales = {333, 444, 555, 555, 444, 333, 111, 111, 555, 444, 555, 444};
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.getMonthOfMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthCountOfSalesBottomAverage(){
        long[] sales = {333, 444, 555, 555, 444, 333, 111, 111, 555, 444, 555, 444}; //average=407
        int expected = 4;
        StatsService service = new StatsService();
        int actual = service.getMonthCountOfSalesBottomAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMonthCountOfSalesUpperAverage(){
        long[] sales = {333, 444, 555, 555, 444, 333, 111, 111, 555, 444, 555, 444}; //average=407
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.getMonthCountOfSalesUpperAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}

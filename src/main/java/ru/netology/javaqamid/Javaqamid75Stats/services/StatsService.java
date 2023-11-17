package ru.netology.javaqamid.Javaqamid75Stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getSumSales(long[] sales) {
        int sumSales = 0;

        for (long sale : sales) {
            sumSales += (int) sale;
        }
        return sumSales;
    }

    public int getAverageSales(long[] sales) {
        int sumSales = 0;
        int averageSales = 0;

        for (long sale : sales) {
            sumSales += (int) sale;
            averageSales = (sumSales / sales.length);
        }
        return averageSales;
    }

    public int getBelowAverageSales(long[] sales) {
        int sumSales = 0;
        int belowAverageSales = getAverageSales(sales);

        for (long sale : sales) {
            if (sale > belowAverageSales) {
                sumSales++;
            }


        }
        return sumSales;
    }

    public int getAboveAverageSAles(long[] sales) {
        int sumSales = 0;
        int aboveAverageSales = getAverageSales(sales);

        for (long sale : sales) {
            if (sale < aboveAverageSales) {
                sumSales++;
            }
        }
        return sumSales;
    }

}


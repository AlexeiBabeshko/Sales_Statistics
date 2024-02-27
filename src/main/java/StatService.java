public class StatService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);

        return sum / sales.length;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long countLessThanAvg(long[] sales) {
        long avg = avgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < avg) {
                months++;
            }
        }
        return months;
    }

    public long countMoreThanAvg(long[] sales) {
        long avg = avgSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avg) {
                months++;
            }
        }
        return months;
    }
}


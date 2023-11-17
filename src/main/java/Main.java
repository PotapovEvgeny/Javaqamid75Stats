import ru.netology.javaqamid.Javaqamid75Stats.services.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.minSales(sales));
        System.out.println(service.getMaxSales(sales));
        System.out.println(service.getSumSales(sales));
        System.out.println(service.getAverageSales(sales));
        System.out.println(service.getBelowAverageSales(sales));
        System.out.println(service.getAboveAverageSAles(sales));

    }
}

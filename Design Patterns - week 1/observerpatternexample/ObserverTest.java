public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Bhagyasri");

        Observer webUser = new WebApp("Cognizant User");

        stockMarket.registerObserver(mobileUser);

        stockMarket.registerObserver(webUser);

        System.out.println("TCS Price Changed:");

        stockMarket.setStockPrice("TCS", 3850.50);

        System.out.println("\nInfosys Price Changed:");

        stockMarket.setStockPrice("Infosys", 1620.75);
    }
}
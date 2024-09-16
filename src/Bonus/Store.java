package Bonus;

public class Store {
    private String storeName;
    public Product candles = new Product("candles", 7.50, 34);
    public Product scarfs = new Product("scarfs", 24.75, 12);
    public Product hats = new Product("hats", 32.95, 3);

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public void buyProduct(String productName, int quantity, double money) {
        switch (productName) {
            case "candles":
                candles.buyProduct(candles, quantity, money);
                break;
            case "scarfs":
                scarfs.buyProduct(scarfs, quantity, money);
                break;
            case "hats":
                hats.buyProduct(hats, quantity, money);
                break;
            default:
                System.out.println("We don't have " + productName);
        }

    }

    public void printStock(){
        String info = storeName + " stock overview: \n" +
                scarfs.getName() + ": " + scarfs.getQuantityInStock() + "\n" +
                candles.getName() + ": " + candles.getQuantityInStock() + "\n" +
                hats.getName() + ": " + hats.getQuantityInStock() + "\n";
        System.out.println(info);
    }
}

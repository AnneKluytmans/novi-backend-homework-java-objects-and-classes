package Bonus;

public class Store {
    private String storeName;
    private final String scarfs = "scarfs";
    private final String candles = "candles";
    private int scarfsAmount = 0;
    private int candlesAmount = 0;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    public void increaseAmount(String product, int amount){
        switch (product){
            case scarfs:
                scarfsAmount += amount;
                break;
            case candles:
                candlesAmount += amount;
                break;
            default:
                System.out.println(storeName + " doesn't sell " + product);
        }

    }

    public void printStock(){
        String info = storeName + " stock overview: \n" +
                scarfs + ": " + scarfsAmount + "\n" +
                candles + ": " + candlesAmount + "\n";
        System.out.println(info);
    }
}

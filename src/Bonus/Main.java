package Bonus;

public class Main {
    public static void main(String[] args) {
        //Bonus movie
        Movie harryPotter = new Movie("Harry Potter", "David Yates", 2008, "Fantasy");
        harryPotter.printInfo();
        System.out.println(" ");


        //Bonus store
        Store bijenkorf = new Store("Bijenkorf");
        bijenkorf.buyProduct("candles" , 4, 46.99);
        System.out.println(" ");
        bijenkorf.printStock();
        System.out.println(" ");

        bijenkorf.buyProduct("hats", 6, 100.56);
        System.out.println(" ");
        bijenkorf.buyProduct("scarfs", 3, 22.46);
        System.out.println(" ");
        bijenkorf.buyProduct("candles", 2, 100.34);
        System.out.println(" ");
        bijenkorf.buyProduct("socks", 3, 159.60);
        System.out.println(" ");
        bijenkorf.printStock();


        //Bonus zoo
        Zoo blijdorp = new Zoo("Blijdorp");
        blijdorp.zooAnimals();
    }
}

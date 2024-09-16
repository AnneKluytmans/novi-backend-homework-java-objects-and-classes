package Bonus;

public class Main {
    public static void main(String[] args) {
        //Bonus movie
        Movie harryPotter = new Movie("Harry Potter", "David Yates", 2008, "Fantasy");
        harryPotter.printInfo();
        System.out.println(" ");


        //Bonus store
        Store bijenkorf = new Store("Bijenkorf");
        bijenkorf.increaseAmount("candles", 33);
        bijenkorf.increaseAmount("scarfs", 12);
        bijenkorf.increaseAmount("hats", 3);
        bijenkorf.printStock();
        System.out.println(" ");


        //Bonus zoo
        Zoo blijdorp = new Zoo("Blijdorp");
        blijdorp.zooAnimals();
    }
}

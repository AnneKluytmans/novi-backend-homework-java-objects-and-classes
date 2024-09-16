package Bonus;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }


    public void buyProduct(Product product, int quantity, double money) {
        if (quantity >= product.getQuantityInStock()) {
            System.out.println("We have only " + product.getQuantityInStock() + " " + product.getName() + " in stock");
            return;
        }

        if (money < (quantity * product.getPrice())) {
            System.out.println("Your saldo isn't enough");
            return;
        } else if (money > (quantity * product.getPrice())) {
            double change = money - (quantity * product.getPrice());
            System.out.println("Here is your change: €" + change);
        } else {
            System.out.println("Woohoo you have exactly enough money to buy " + quantity + " " + product);
        }

        product.setQuantityInStock(product.getQuantityInStock() - quantity);
        System.out.println("Enjoy your purchase");

    }



}

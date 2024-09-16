package Bonus;

public class Animal {
    public String name;
    public int age;
    public final String species;
    public String food;
    public String zooArea;

    public Animal(String name, int Age, String species, String food, String zooArea) {
        this.name = name;
        this.age = Age;
        this.species = species;
        this.food = food;
        this.zooArea = zooArea;
    }

    public void animalInfo() {
        System.out.println("In " + zooArea + " vind je " + species + " " + name + ". " + name + " is "
                + age + " jaar oud en eet graag " + food + ".");
    }


}

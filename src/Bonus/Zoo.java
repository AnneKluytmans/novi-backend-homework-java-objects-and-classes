package Bonus;

public class Zoo {
    String name;
    Animal lion = new Animal("Simba", 5, "leeuw", "vlees", "de Afrikaanse zone");
    Animal gorilla = new Animal("Bokito", 9, "gorilla", "noten, bladeren en vruchten", "de Afrikaanse zone");
    Animal penguin = new Animal("Happy Feet", 4, "pinguïn", "vis", "het Oceanium");

    public Zoo(String name) {
        this.name = name;
    }

    public void zooAnimals() {
        System.out.println("Dieren in " + this.name + ": ");
        lion.animalInfo();
        gorilla.animalInfo();
        penguin.animalInfo();
    }
}

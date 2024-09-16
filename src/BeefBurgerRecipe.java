public class BeefBurgerRecipe {
    Ingredient oliveOil = new Ingredient(0.5f, "tbsp", "olive oil");
    Ingredient onion = new Ingredient(1f, null, "onion");
    Ingredient lettuce = new Ingredient(8f, "leaves", "lettuce");
    Ingredient tomato = new Ingredient(1f, null, "beef tomato");
    Ingredient beefMince = new Ingredient(500f, "g", "beef mince 15% fat");
    Ingredient driedHerbs = new Ingredient(1f, "tsp", "dried herbs");
    Ingredient egg = new Ingredient(1f, null, "egg");
    Ingredient cheddar = new Ingredient(4f, "slices", "cheddar");
    Ingredient whiteBun = new Ingredient(4f, null, "white buns");


    public void printIngredients() {
        System.out.println("\nIngredients:\n");
        System.out.println(oliveOil.toString());
        System.out.println(onion.toString());
        System.out.println(lettuce.toString());
        System.out.println(tomato.toString());
        System.out.println(beefMince.toString());
        System.out.println(driedHerbs.toString());
        System.out.println(egg.toString());
        System.out.println(cheddar.toString());
        System.out.println(whiteBun.toString());
        System.out.println(" ");
    }


    public void printInstructions() {
        System.out.println("\nRecipe instructions:\n");
        fryOnion();
        makeBurgers();
        bakeBurgers();
        buildBurgers();
        System.out.println(" ");
    }


    public void fryOnion() {
        System.out.println("- Heat the olive oil in a frying pan, add the onion and cook for 5 minutes until softened and " +
                "starting to turn golden. Set aside.");
    }

    public void makeBurgers() {
        System.out.println("- In a bowl, combine the beef mince with the herbs and the egg. Season, add the onions and " +
                "mix well. Using your hands, shape into 4 patties.");
    }

    public void bakeBurgers() {
        System.out.println("- Cook the burgers on a preheated barbecue or griddle for 5-6 minutes on each side. While the " +
                "second side is cooking, lay a slice of cheese on top to melt slightly (if using).");
    }

    public void buildBurgers() {
        System.out.println("- Meanwhile, lightly toast the cut-sides of the buns on the barbecue. Fill with the lettuce, " +
                "burgers and tomato slices. Serve with ketchup, if you like.");
    }

}

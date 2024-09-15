public class BeefBurgerRecipe {
    Ingredient oliveOil = new Ingredient(0.5f, "tbsp", "olive oil");
    Ingredient onion = new Ingredient(1f, "piece(s)", "onion");
    Ingredient lettuce = new Ingredient(8f, "leaves", "lettuce");
    Ingredient tomato = new Ingredient(1f, "piece(s)", "beef tomato");
    Ingredient beefMince = new Ingredient(500f, "g", "beef mince 15% fat");
    Ingredient driedHerbs = new Ingredient(1f, "tsp", "dried herbs");
    Ingredient egg = new Ingredient(1f, "piece(s)", "egg");
    Ingredient cheddar = new Ingredient(4f, "slices", "cheddar");
    Ingredient whiteBun = new Ingredient(4f, "piece(s)", "white buns");
    //kan je ook de unit weglaten?


    public void printIngredients() {
        System.out.println("Ingredients:");
        System.out.println(oliveOil.getAmount() + " " + oliveOil.getUnit() + " " + oliveOil.getName());
        System.out.println(onion.getAmount() + " " + onion.getUnit() + " " + onion.getName());
        System.out.println(lettuce.getAmount() + " " + lettuce.getUnit() + " " + lettuce.getName());
        System.out.println(tomato.getAmount() + " " + tomato.getUnit() + " " + tomato.getName());
        System.out.println(beefMince.getAmount() + " " + beefMince.getUnit() + " " + beefMince.getName());
        System.out.println(driedHerbs.getAmount() + " " + driedHerbs.getUnit() + " " + driedHerbs.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(cheddar.getAmount() + " " + cheddar.getUnit() + " " + cheddar.getName());
        System.out.println(whiteBun.getAmount() + " " + whiteBun.getUnit() + " " + whiteBun.getName());
    }


    public void printInstructions() {
        System.out.println("Recipe instructions:");
        fryOnion();
        makeBurgers();
        bakeBurgers();
        buildBurgers();
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

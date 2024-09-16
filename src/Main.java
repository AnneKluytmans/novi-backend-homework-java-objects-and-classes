public class Main {
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        BeefBurgerRecipe beefBurgerRecipe = new BeefBurgerRecipe();

        System.out.println("------------Apple pie recipe-------------");
        applePieRecipe.printIngredients();
        applePieRecipe.printInstructions();

        System.out.println("-----------Beef burger recipe------------");
        beefBurgerRecipe.printIngredients();
        beefBurgerRecipe.printInstructions();
    }
}

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        BeefBurgerRecipe beefBurgerRecipe = new BeefBurgerRecipe();

        applePieRecipe.printIngredients();
        System.out.println(" ");
        applePieRecipe.printInstructions();
        //kun je bij een float de .0 weglaten?

        beefBurgerRecipe.printIngredients();
        System.out.println(" ");
        beefBurgerRecipe.printInstructions();
    }
}

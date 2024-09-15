public class ApplePieRecipe {
    //moet er public of private voor?
    Ingredient butter = new Ingredient(200f, "gram", "ongezouten roomboter");
    Ingredient casterSugar = new Ingredient(200f, "gram", "witter basterd suiker");
    Ingredient flour = new Ingredient(400f, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1f, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8f, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1f, "snuf", "zout");
    Ingredient apples = new Ingredient(1.5f, "kilo", "zoetzure appels");
    Ingredient cristalSugar = new Ingredient(75f, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3f, "theelepels", "kaneel");
    Ingredient breadCrumbs = new Ingredient(15f, "gram", "paneermeel");


    public void printIngredients() {
        System.out.println("Recipe ingredients:");
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(casterSugar.getAmount() + " " + casterSugar.getUnit() + " " + casterSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(cristalSugar.getAmount() + " " + cristalSugar.getUnit() + " " + cristalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }

    public void printInstructions() {
        System.out.println("Recipe instructions:");
        preHeatOven();
        whiskEgg();
        makeDough();
        sliceApples();
        greaseBakingTin();
        lineBakingTin();
        fillBakingTin();
        makeRibbons();
        placeRibbons();
        bakePie();
    }

    public void preHeatOven() {
        System.out.println("- Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void whiskEgg() {
        System.out.println("- Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere " +
                "deel is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("- Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker " +
                "en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void sliceApples() {
        System.out.println("- Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseBakingTin() {
        System.out.println("- Vet de springvorm in en bestrooi deze met bloem");
    }

    public void lineBakingTin() {
        System.out.println("- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het " +
                "deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. " +
                "De paneermeel neemt het vocht van de appels op.");
    }

    public void fillBakingTin() {
        System.out.println("- Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel " +
                "overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void makeRibbons() {
        System.out.println("- Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void placeRibbons() {
        System.out.println("- Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom " +
                "af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakePie() {
        System.out.println("- Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden " +
                "Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}

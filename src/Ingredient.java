public class Ingredient {
    private float amount;
    private String unit;
    private String name;

    //If you make your own constructors you can't use the automatically generated empty constructor anymore,
    // so you need to create your own empty constructor
    public Ingredient() {
    }

    public Ingredient(float amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }


    public float getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }


    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        if (unit != null) {
            if (amount % 1 == 0) {
                return (int) amount + " " + unit + " " + name;
            } else {
                return amount + " " + unit + " " + name;
            }
        } else {
            if (amount % 1 == 0) {
                return (int) amount + " " + name;
            } else {
                return amount + " " + name;
            }
        }


    }
}

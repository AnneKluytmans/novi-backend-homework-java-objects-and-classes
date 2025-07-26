# Apple Pie Recipe – NOVI Backend Java Assignment

## About the Project

This repository contains my solution to the **Apple Pie Recipe** assignment from the Backend Java module at [Novi University](https://www.novi.nl).

The goal of this project is to practice working with **Java classes**, **methods**, **constructors**, and **objects**, by building a clean and modular Java application that prints the full recipe for a traditional Dutch apple pie. This includes handling ingredients, step-by-step instructions, and structured code organization across multiple classes.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17**+
- **IntelliJ IDEA**

---

## Key Features

- `Ingredient` class with
- `ApplePieRecipe` class and `BeefBurgerRecipe` class with:
    - One object per listed ingredient
    - A method for each recipe step that prints a description using `System.out.println()`
    - A method to print all ingredients
    - A method to print all steps at once
- `Main` class that creates an `ApplePieRecipe` and `BeefBurgerRecipe` instance and runs the recipes logic
- 
---

## How to Run

1. Open the project in your IDE (IntelliJ IDEA)
2. Navigate to `Main.java` in `src/main/java`
3. Click the green play button next to the `main()` method → **Run 'Main'** or use the terminal:
```bash
./mvnw clean compile exec:java
```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."
# Pizza Ordering System

This is a console-based Java application for ordering pizzas, developed by Sathvika Vallepu.

## Description

The Pizza Ordering System allows users to order different types of pizzas (Veg, Non-Veg, Deluxe Veg, Deluxe Non-Veg) with options for extra toppings, extra cheese, and takeaway packaging. The application calculates and displays a detailed bill based on user selections.

## Features

- Choose from four pizza types: Veg Pizza (₹400), Non-Veg Pizza (₹500), Deluxe Veg Pizza (₹600), Deluxe Non-Veg Pizza (₹700).
- Add extra toppings (₹200), extra cheese (₹100), or takeaway packaging (₹40).
- View a detailed bill with all charges.
- Object-oriented design with inheritance (`pizza` and `deluxPizza` classes).

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/VallepuSathvika/PizzaOrderingSystem.git
   ```
2. Navigate to the project folder:

   ```bash
   cd PizzaOrderingSystem
   ```
3. Compile the Java files:

   ```bash
   javac src/sweety/*.java
   ```
4. Run the main class:

   ```bash
   java -cp src sweety.Main
   ```

## Requirements

- Java JDK 8 or higher
- Git

## Project Structure

- `src/sweety/Main.java`: Entry point of the application.
- `src/sweety/pizza.java`: Base class for pizza functionality.
- `src/sweety/deluxPizza.java`: Derived class for deluxe pizzas.

## Author

Sathvika Vallepu
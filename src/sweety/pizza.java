package sweety;
import java.util.Scanner;

public class pizza {
    protected int price;
    private boolean veg;
    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 200;
    protected int backPackPrice = 40;
    
    protected int basePizzaPrice;
    
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;
    
    Scanner in = new Scanner(System.in);
    
    public pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 400;
        } else {
            this.price = 500;
        }
        basePizzaPrice = this.price;
    }
    
    public void addExtraCheese() {
    	System.out.println("\n--- Add Extra Cheese ---");
        System.out.print("Would you like extra cheese (+₹" + extraCheesePrice + ")? (y/n): ");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
            System.out.println("Extra cheese added!");
        }
    }
    
    public void addExtraToppings() {
    	System.out.println("\n--- Add Extra Toppings ---");
        System.out.print("Would you like extra toppings (+₹" + extraToppingsPrice + ")? (y/n): ");
        char ch = in.next().charAt(0);
        if (ch == 'y') {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
            System.out.println("Extra toppings added!");
        }
    }

    public void takeAway() {
    	System.out.println("\n--- Takeaway Option ---");
        System.out.print("Would you like takeaway (+₹" + backPackPrice + ")? (y/n): ");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isOptedForTakeaway = true;
            this.price += backPackPrice;
        }
    }

    public void getBill() {
        System.out.println("\n==================================================");
        System.out.println("               Pizzamania Bill Receipt             ");
        System.out.println("==================================================");
        System.out.printf("%-25s: ₹%d%n", "Base Pizza", basePizzaPrice);
        if (isExtraCheeseAdded) {
            System.out.printf("%-25s: ₹%d%n", "Extra Cheese", extraCheesePrice);
        }
        if (isExtraToppingsAdded) {
            System.out.printf("%-25s: ₹%d%n", "Extra Toppings", extraToppingsPrice);
        }
        if (isOptedForTakeaway) {
            System.out.printf("%-25s: ₹%d%n", "Takeaway Charge", backPackPrice);
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("%-25s: ₹%d%n", "Total Amount", this.price);
        System.out.println("==================================================");
        System.out.println("\nThank you for your order! Visit us again!");
        System.out.println("==================================================");
    }
}
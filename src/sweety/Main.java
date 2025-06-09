package sweety;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("==================================================");
        System.out.println("        Welcome to Pizzamania - Order Now!        ");
        System.out.println("==================================================");
        System.out.println("\nPlease select your pizza:");
        System.out.println("  1. Veg Pizza          - ₹400");
        System.out.println("  2. Non-Veg Pizza      - ₹500");
        System.out.println("  3. Deluxe Veg Pizza   - ₹600");
        System.out.println("  4. Deluxe Non-Veg Pizza - ₹700");
        System.out.println("==================================================");
        System.out.print("Enter your choice (1-4): ");
        
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;

            case 2:
                pizza nonvegPizza = new pizza(false);
                nonvegPizza.addExtraToppings();
                nonvegPizza.addExtraCheese();
                nonvegPizza.takeAway();
                nonvegPizza.getBill();
                break;

            case 3:
                deluxPizza veg = new deluxPizza(true);
                veg.basePizzaPrice = 600;
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;

            case 4:
                deluxPizza nonveg = new deluxPizza(false);
                nonveg.basePizzaPrice = 700;
                nonveg.addExtraToppings();
                nonveg.addExtraCheese();
                nonveg.takeAway();
                nonveg.getBill();
                break;

            default:
                System.out.println("Sorry, please enter a valid option!");
        }
        sc.close();
    }
}
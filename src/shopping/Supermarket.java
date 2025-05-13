package shopping;

import java.util.Scanner;
//import static shopping.ShoppingTrolley.buyItem;

/**
 *
 * @author kheal
 */
public class Supermarket {

    public static void main(String[] args) {

        ShoppingTrolley myBag = new ShoppingTrolley(); // this is myBag. I can buy things to put in it
        Scanner input = new Scanner(System.in);

        // loop to keep shopping until user checks out
        boolean shopping = true;

        while (shopping) {
            // display bthe menu
            System.out.println("\nWelcome to the supermarket");
            System.out.println("1. Buy Bread (RetailItem)");
            System.out.println("2. Buy Milk (FoodItem)");
            System.out.println("3. Buy Soap (HouseholdItem)");
            System.out.println("4. Proceed to Checkout");
            System.out.print("Choose an Option: ");

            String choice = input.nextLine();

            // handle the choices
            switch (choice) {
                case "1":
                    RetailItems bread = new RetailItems("Bread", 1.50);
                    buyItem(input, myBag, bread);
                    break;

                case "2":
                    FoodItems milk = new FoodItems("Milk", 2.67, "2025-06-15");
                    buyItem(input, myBag, milk);
                    break;

                case "3":
                    HouseHoldItem soap = new HouseHoldItem("Soap", 1.2, 0.25);
                    buyItem(input, myBag, soap);
                    break;

                case "4":
                    shopping = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // done shopping, now print out what is in the trolley
        System.out.println("\n Your Shopping Trolley:");
        System.out.println(myBag.emptyTrolley());
    }

    //  method to handle quantity input and  add item to trolley
    public static void buyItem(Scanner input, ShoppingTrolley myBag, Object item) {
        System.out.print("How many would you like to buy? ");
        try {
            int qty = Integer.parseInt(input.nextLine());
            if (qty <= 0) {
                System.out.println("Quantity must be at least 1.");
                return;
            }
            for (int i = 0; i < qty; i++) {
                myBag.buyItem(item); // add each item one by one
            }
            System.out.println("Added " + qty + " to trolley.");
        } catch (NumberFormatException e) {
            System.out.println(" Invalid number. Try again.");
        }
    }
}

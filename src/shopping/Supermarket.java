/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopping;

/**
 *
 * @author kheal
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShoppingTrolley myBag = new ShoppingTrolley(); //this is myBag. I can buy things to put in it
        
        /*
          YOU MUST COMPLETE THIS CODE - REMEMBER TO COMMENT WHAT YOU HAVE DONE AND TRY TO MODULARISE YOUR CODE (i.e. create your own methods)
        */
        
          
        // created a RetailItem object
        RetailItems item = new RetailItems("Apple", 1.99);

        // Displaied the item details using the toString method
        System.out.println(item.toString());
        
        //create a foodItem
        FoodItems milk  = new FoodItems("Milk",2.67,"2025-06-15");
        
        //printing it
        System.out.println(milk.toString());
    }
    
}

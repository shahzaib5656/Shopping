/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author shahz
 */

//foodItems is a subclass of retailitems
public class FoodItems extends RetailItems{
    private String expiryDate;
    
    
    //constructor for fooditems
    public FoodItems(String name , double price , String expiryDate){
        super(name, price);//called parent constructor
        this.expiryDate = expiryDate;
    }
    
    //getter for expirtdate
    public String getExpiryDate(){
        return expiryDate;
    }
    
    //setter for expiryDate
    public void setExpiryDate (String expiryDate){
        this.expiryDate= expiryDate;
    }
    
    //Overriding the toString method
    @Override
    public String toString(){
        return super.toString() + "| Expiry: "+ expiryDate;
    }
}


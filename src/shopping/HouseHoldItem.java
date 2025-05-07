/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author shahz
 */
public class HouseHoldItem extends RetailItems {
    private double weight;
    
    //Made a constructor
    public HouseHoldItem(String name,double price, double weight){
        super (name,price);
        this.weight = weight;
    }
            
        //getterb for the weight
     public double getWeight (){    
    return weight;
    }
     
     //setter fot the weight
        public void setWeight(double weight){
                 this.weight= weight;
            }
        
        //methgod overloadding: getdiscription with no parameters
        public String getDescription(){
            return getName() + " weighs " + weight + "kg.";
        }
        
        //Overlod getDescription method with unit parameter
        public String getDescription(String unit){
            if (unit.equalsIgnoreCase("g")){
                return getName()+" weighs " +(weight *1000)+ " grams.";
            }
            else{
                return getDescription();  //defult to kg
            }
        }
        
        @Override
          public  String toString (){
              return super.toString() + " weight: "+ weight +"kg";
          }
}

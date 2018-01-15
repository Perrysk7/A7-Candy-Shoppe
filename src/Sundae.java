/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream {
    // instance variables 
    // name of the ice cream 
    private String IceName; 
    // Nmae of the topping
    private String ToppingName; 
    // cost of the topping 
    private int ToppingCost; 
    // cost of the ice cream 
    private int IceCost; 
    
    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
        super(icName, icCost);
        this.ToppingName = toppingName; 
        this.ToppingCost = toppingCost;    
    }
    
    @Override
    public String toString()
    {
        String output = "";
        output += IceCost + " \n";
        output += super.getName() + " \n";
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - DessertShoppe.cents2dollarsAndCents(getCost()).length(); i++){
            output += " "; 
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost()); 
        return output;   
    }
     public String getToppingName(){
        return this.ToppingName;
    }
    
    public int getToppingCost(){
        return ToppingCost;
        
    }
    
    public int getCost() {
        return this.IceCost + ToppingCost;
    } 
}

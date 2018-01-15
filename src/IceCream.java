/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class IceCream extends DessertItem {
    // instance variables
    // cost of the ice cream
    private int IceCost;
    

    public IceCream(String name, int cost)
    {
        super(name); 
        this.IceCost = cost;   
    }
    
    @Override
    public String toString()
    {
        String output = "";
        output += IceCost + " \n"; 
        output += super.getName() + getCost() + " \n"; 
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - DessertShoppe.cents2dollarsAndCents(getCost()).length(); i++){
            output += " "; 
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        return output;  
    }
    public int getCost(){
        return this.IceCost; 
    }  
}
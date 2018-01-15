/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Candy extends DessertItem {
    // instance variables 
    // weight of the candy 
    private double weight; 
    // price of the candy for every pound 
    private int PricePerLbs; 
   
    public Candy(String name, double weight, int pricePerLbs)
    {
        super(name); 
        this.weight = weight; 
        this.PricePerLbs = pricePerLbs;  
    }

 
    @Override
    public String toString()
    {
        String output = ""; 
        output += weight + "lb. @ $" + DessertShoppe.cents2dollarsAndCents(PricePerLbs) + "/lb \n"; 
        output += super.getName() + getCost() + " \n"; 
        // finding the spacing 
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - DessertShoppe.cents2dollarsAndCents(getCost()).length();i++){
            output += " ";
        }
        // display of price
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        return output; 
       
    }
    public double getWeight(){
        return weight; 
    }
    public int getCost(){
        int cost = (int)Math.round(weight * PricePerLbs); 
        return cost; 
    }
}

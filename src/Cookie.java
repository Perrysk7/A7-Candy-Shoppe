/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {
    // instance variables 
    // the number of cookies 
    private int Number;
    // the price for dozen cookies 
    private int PricePer12; 
    
    public Cookie(String name, int number, int pricePer12)
    {
         super(name); 
         this.Number = number; 
         this.PricePer12 = pricePer12; 
        
    }

    @Override
    public String toString()
    { 
        String output = "";
        output += Number + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(PricePer12) + "/dz \n";
        output += "Name: " + super.getName() + " \n";
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - DessertShoppe.cents2dollarsAndCents(getCost()).length(); i++){
            output += " "; 
        }
        output += DessertShoppe.cents2dollarsAndCents(getCost());
        return output;   
    }
    
    public int getNumber(){
        return Number; 
    }
    
    public int getCost(){
         double cookie = PricePer12 / 12;
        int cost = (int)Math.round(Number * PricePer12)/12;
        return cost;
    }
}

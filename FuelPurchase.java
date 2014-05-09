/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carrental;

/**
 *
 * @author Daniel
 */
public class FuelPurchase {
	
        private double fuelPrice;       //variable to hold price of fuel per litre - Daniel
        private double fuelAmount;      //variable to hold litres of fuel purchased - Daniel

	public FuelPurchase(double fuelPrice, double fuelAmount) {
		this.fuelPrice = fuelPrice;
                this.fuelAmount = fuelAmount;
	}

        //Method to get total amount spent on fuel - Daniel
        public double getTotalCost() {
            return this.fuelPrice * fuelAmount;
        }
        
        //Method to get fuel economy in litres per 100km - Daniel
	public double getFuelEconomy() {
		return this.fuelAmount / 100;
	}

         //Getter and setter for fuelPrice variable - Daniel      
        public double getFuelPrice() {
            return fuelPrice;
        }
        
        public void setFuelPrice() {
            this.fuelPrice = fuelPrice;
        }
        
        //Getter and setter for fuelAmount - Daniel
        public double getFuelAmount() {
            return fuelAmount;
        }
        
        public void setFuelAmount() {
            this.fuelAmount = fuelAmount;
        }
	
}

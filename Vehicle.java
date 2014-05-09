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
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int			makeYear;

	private Journey			journey;
	
	//removed @SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(75,100);    //First number is fuelPrice, second is fuelAmount - Kristian
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(75,100);  //First number is fuelPrice, second is fuelAmount - Kristian
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
                System.out.println(" Total fuel cost: $" + fuelPurchase.getTotalCost());    //Print total fuel cost - Kristian
		System.out.println("Total Services: " + journey.getTotalServices());
                System.out.println("Fuel Economy: " + fuelPurchase.getFuelEconomy() + " litres per 100km"); //Print fuel economy - Kristian
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
	}

}

//		CS1410 Assignment 1: Driving Cost Calculator
//		Nils Streedain
package a1;

public class DrivingCostCalculator {

	public static void main(String[] args) {
//		Initialization of primary variables
		double milesToDrive = 100;
		double milesPerGallon = 28;
		double dollarsPerGallon = 2.5;
		double milesPerKWh = 4;
		double dollarsPerKWh = .106;
		
//		Inputs primary variables to trip cost methods then saves the returned output into a variable. Variables then formatted to 2 decimals
		double gasTripCost = calculateGasTripCost(milesToDrive, milesPerGallon, dollarsPerGallon);
		double evTripCost = calculateElectricTripCost(milesToDrive, milesPerKWh, dollarsPerKWh);
		String gasTripCostString = String.format("%.2f", gasTripCost);
		String evTripCostString = String.format("%.2f", evTripCost);
		
//		Displays title banner with the method, then prints total costs in sentence form to the console
		displayBanner();
		System.out.println("The cost of a " + milesToDrive + " mile trip by gas is " + gasTripCostString + " and by electric is " + evTripCostString + ".");
	}
	
	public static double calculateGasTripCost(double milesToDrive, double milesPerGallon, double dollarsPerGallon) {
//		Calculates the number of gallons by dividing the total distance by the miles per gallon, then multiplies by the cost per gallon
//		to find the total cost of the distance. The total cost is returned to the main method.
		
		double numGallons = milesToDrive / milesPerGallon;
		double gasTripCost = numGallons  * dollarsPerGallon;
		return gasTripCost;
	}
	
	public static double calculateElectricTripCost(double milesToDrive, double milesPerKWh, double dollarsPerKWh) {
//		Calculates kilowatt hours by dividing the total distance by the miles per kilowatt, then multiplies by the cost per kilowatt
//		to find the total cost of the distance. The total cost is returned to the main method.
		
		double numKWh = milesToDrive / milesPerKWh;
		double evTripCost = numKWh * dollarsPerKWh;
		return evTripCost;
	}
	
	public static void displayBanner() {
//		Creates multi-line banner in Console using ASCII extended characters
		
		System.out.println("╔═══════════════════════════════════════════════════════════════╗");
		System.out.println("║								║");
		System.out.println("║		Cost of gas vs. electric vehicles		║");
		System.out.println("║								║");
		System.out.println("╚═══════════════════════════════════════════════════════════════╝");
	}
}
package com.bridgelabzassignment.InvoiceGenerator;

/**
 * The class Invoice Generator is used to generate invoices to cabs.
 * @author sanjana.rao_ymediala
 * @since 25-09-2021
 */
public class InvoiceGenerator 
{
	//Constructor with a welcome message
	public InvoiceGenerator()
	{
		System.out.println("Welcome to Invoice Generator System");
	}
	
	/**
	 * The method calculateTotalFare calculates the total fare of the passenger.
	 * @param distance is the distance traveled by the passenger
	 * @param time is the time taken to reach the destination
	 * @return total Fare calculated.
	 */
	public double calculateTotalFare(double distance, double time)
	{
		double totalFare = (10 * distance) + (time * 1);
		if(totalFare <= 5)
			totalFare = 5.0;
		return totalFare;
	}

	public double calculateTotalFare(Ride[] rides) 
	{
		double totalFare = 0.0;
		for (Ride ride : rides) 
		{
			totalFare += this.calculateTotalFare(ride.distance, ride.time);
		}
		return totalFare;
	}
}

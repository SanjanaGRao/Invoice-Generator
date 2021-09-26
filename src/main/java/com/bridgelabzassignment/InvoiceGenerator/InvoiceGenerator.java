package com.bridgelabzassignment.InvoiceGenerator;

public class InvoiceGenerator 
{
	public InvoiceGenerator()
	{
		System.out.println("Welcome to Invoice Generator System");
	}
	
	public double calculateTotalFare(double distance, double time)
	{
		double totalFare;
		totalFare = (10 * distance) + (time * 1);
		return totalFare;
	}

}

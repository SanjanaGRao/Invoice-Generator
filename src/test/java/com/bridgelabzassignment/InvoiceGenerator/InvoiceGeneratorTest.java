package com.bridgelabzassignment.InvoiceGenerator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest 
{
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare()
	{
		InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
		double distance = 2.0;
		double time = 5.0;
		double fare = invoiceGenerator.calculateTotalFare(distance, time);
		Assert.assertEquals(25.0, fare, 0.0);
	}
}

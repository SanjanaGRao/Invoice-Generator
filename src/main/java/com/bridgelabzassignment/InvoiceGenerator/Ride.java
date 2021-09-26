package com.bridgelabzassignment.InvoiceGenerator;

/**
 * The class Ride is used to find total fares of multiple rides.
 * @param distance is the distance traveled in one ride
 * @param time is the time taken for a ride.
 * @author Sanjana Rao
 * @since 25-09-2021
 */
public class Ride 
{
	public double distance;
	public double time;

	//Constructor to initialize distance and time
	public Ride(double distance, double time)
	{
		this.distance = distance;
		this.time = time;
	}
}

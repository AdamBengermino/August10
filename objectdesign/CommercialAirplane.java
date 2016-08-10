package com.objectdesign;

public class CommercialAirplane extends Airplane
{
	public int doors = 0; 
	public int windows = 0; 
	public int seats = 0; 
	public int wheels = 0; 
	public float wingspan = 0; 
	public int wings = 0; 
	public int pilots = 0; 
	public int flightAttendants = 0; 
	public String snacksServed = null; 
	public String servesAlcohol = null;
	
	public CommercialAirplane(int doors, int windows, int seats, int wheels, float wingspan, int wings, int pilots,
			int flightAttendants, String snacksServed, String servesAlcohol)
	{
		super();
		this.doors = doors;
		this.windows = windows;
		this.seats = seats;
		this.wheels = wheels;
		this.wingspan = wingspan;
		this.wings = wings;
		this.pilots = pilots;
		this.flightAttendants = flightAttendants;
		this.snacksServed = snacksServed;
		this.servesAlcohol = servesAlcohol;
	}

	public CommercialAirplane()
	{
	
	}

	public int getDoors()
	{
		return doors;
	}

	public void setDoors(int doors)
	{
		this.doors = doors;
	}

	public int getWindows()
	{
		return windows;
	}

	public void setWindows(int windows)
	{
		this.windows = windows;
	}

	public int getSeats()
	{
		return seats;
	}

	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	public float getWingspan()
	{
		return wingspan;
	}

	public void setWingspan(float wingspan)
	{
		this.wingspan = wingspan;
	}

	public int getWings()
	{
		return wings;
	}

	public void setWings(int wings)
	{
		this.wings = wings;
	}

	public int getPilots()
	{
		return pilots;
	}

	public void setPilots(int pilots)
	{
		this.pilots = pilots;
	}

	public int getFlightAttendants()
	{
		return flightAttendants;
	}

	public void setFlightAttendants(int flightAttendants)
	{
		this.flightAttendants = flightAttendants;
	}

	public String getSnacksServed()
	{
		return snacksServed;
	}

	public void setSnacksServed(String snacksServed)
	{
		this.snacksServed = snacksServed;
	}

	public String servesAlcohol()
	{
		return servesAlcohol;
	}

	public void setServesAlcohol(String stringToFly)
	{
		this.servesAlcohol = stringToFly;
	}

	@Override
	public void starts()
	{
		
	}

	@Override
	public void stops()
	{
		
	}

	@Override
	public void flies()
	{
		
	}

	@Override
	public String toString()
	{
		return "So you'd like a commercial airplane with " + doors + " doors, " + windows + " windows, " + seats +" seats, " + wheels
				+ " wheels, a wingspan of " + wingspan + ", " + wings + " wings, " + pilots + " pilots, and " + flightAttendants +" flight attendants? You'd like to have " + snacksServed + ", and you'd like to drink " + servesAlcohol + "?";
	}
	
}

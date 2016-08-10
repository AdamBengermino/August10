package com.objectdesign;

public class AirBus extends CommercialAirplane
{
	private boolean bagsChecked = false;

	public AirBus(int doors, int windows, int seats, int wheels, float wingspan, int wings, int pilots,
			int flightAttendants, String snacksServed, String servesAlcohol, boolean bagsChecked)
	{
		super(doors, windows, seats, wheels, wingspan, wings, pilots, flightAttendants, snacksServed, servesAlcohol);
		this.bagsChecked = bagsChecked;
	}

	public boolean isBagsChecked()
	{
		return bagsChecked;
	}

	public void setBagsChecked(boolean bagsChecked)
	{
		this.bagsChecked = bagsChecked;
	} 
}

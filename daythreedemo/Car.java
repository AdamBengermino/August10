package com.daythreedemo;

public class Car extends Vehicle
{
	public int doors = 0; 
	public int windows = 0; 
	public String color = null; 
	public int seats = 0; 
	public int wheels = 0; 
	public String model = null; 
	
	public Car(int doors, int windows, String color, int seats, int wheels, String model)
	{
		super();
		this.doors = doors;
		this.windows = windows;
		this.color = color;
		this.seats = seats;
		this.wheels = wheels;
		this.model = model;
	}
	
	

	public Car()
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

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
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

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	@Override
	public void moves()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void starts()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stops()
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString()
	{
		return "So the car you want has " + doors + " doors, " + windows + " windows, " + seats + " seats, and " + wheels + " wheels.";
	}

}
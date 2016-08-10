package com.objectdesign;

import java.util.Scanner;

import javax.script.ScriptException;
import javax.swing.text.AbstractDocument.LeafElement;

public class Airport
{

	public static void main(String[] args)
	{
		Scanner crash = new Scanner(System.in); 
		String airplaneInput = null; 
		boolean flightRisk = false; 
		int airplaneTrait = 0; 
		float airPlaneTraitFloat = 0; 
		String stringToFly = null; 
		
		CommercialAirplane ourNewPlane = new CommercialAirplane(); 
		
		System.out.println("Welcome to the airport.");
		System.out.println("Where do you want to go today?");
		String userDestination = crash.nextLine(); 

	
	do
	{
		System.out.println("How many doors would you like on your plane?");
		airplaneInput = crash.nextLine();
		flightRisk = numberIsValid(airplaneInput);
			
		} 
		while (flightRisk); 
		
		airplaneTrait = Integer.parseInt(airplaneInput); 
		
		ourNewPlane.setDoors(airplaneTrait);
	
	do
	{
		System.out.println("How many windows would you like on your plane?");
		airplaneInput = crash.nextLine();
		flightRisk = numberIsValid(airplaneInput);
			
		} 
		while (flightRisk); 
		
		airplaneTrait = Integer.parseInt(airplaneInput); 
		
		ourNewPlane.setWindows(airplaneTrait);
	
	do
		{
			System.out.println("How many seats would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
				
			} 
			while (flightRisk); 
			
			airplaneTrait = Integer.parseInt(airplaneInput); 
			
			ourNewPlane.setSeats(airplaneTrait);
			
	do
		{
			System.out.println("How many wheels would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
					
			} 
			while (flightRisk); 
				
			airplaneTrait = Integer.parseInt(airplaneInput); 
				
			ourNewPlane.setWheels(airplaneTrait);
	do
		{
			System.out.println("What wingspan would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
					
			} 
			while (flightRisk); 
				
			airplaneTrait = Integer.parseInt(airplaneInput); 
				
			ourNewPlane.setWingspan(airplaneTrait);
			
	do
		{
			System.out.println("How many wings would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
			
		} 
			while (flightRisk); 
		
			airplaneTrait = Integer.parseInt(airplaneInput); 
		
			ourNewPlane.setWings(airplaneTrait);
	do
		{
			System.out.println("How many pilots would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
					
		} 
			while (flightRisk); 
				
			airplaneTrait = Integer.parseInt(airplaneInput); 
				
			ourNewPlane.setPilots(airplaneTrait);
	do
		{
			System.out.println("How many flight attendants would you like on your plane?");
			airplaneInput = crash.nextLine();
			flightRisk = numberIsValid(airplaneInput);
					
		} 
			while (flightRisk); 
				
			airplaneTrait = Integer.parseInt(airplaneInput); 
				
			ourNewPlane.setFlightAttendants(airplaneTrait);
	do
		{
			System.out.println("What snack would you like to be served?"); 
			airplaneInput = crash.nextLine(); 
			flightRisk = stringIsValid(airplaneInput);
		}
	
			while (flightRisk);
			ourNewPlane.setSnacksServed(airplaneInput); 
	do
		{
			System.out.println("What would you like to drink?"); 
			airplaneInput = crash.nextLine();
			flightRisk = stringIsValid(airplaneInput);

			
		}
		
			while (flightRisk);
			ourNewPlane.setServesAlcohol(airplaneInput);
			
			System.out.println(ourNewPlane.toString());
		}
		
	
	public static boolean numberIsValid (String someStringToNumber)
	{
		try
		{
			int aNumber = Integer.parseInt(someStringToNumber);
			return false; 
		
		} 
		catch (NumberFormatException e)
		{
			return true;
		}
	}
	public static boolean numberIsValidToo(String someStringToFloat)
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToFloat);
			return false;
		}
		catch (NumberFormatException e)
		{
			return true; 
		}
	}
	public static boolean stringIsValid(String someStringToString) 
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToString); 
			return true; 
		}
		catch (NumberFormatException e)
		{
			return false; 
		}
	
	}
	
	
	
}

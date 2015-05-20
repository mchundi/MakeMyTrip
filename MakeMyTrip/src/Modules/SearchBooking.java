//This file does the major operations for a flight booking, like:
//enter the search criteria in the home page
//select the flight
//verify the itinerary


package Modules;

import java.io.File;
import java.io.IOException;

import helperFunctions.*;
import uiMap.HomePage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//import static org.testng.AssertJUnit.*;



public class SearchBooking{
	
	public void loadSearchCriteria(String in) throws IOException{
		
		GetInputs gI = new GetInputs();
		HomePage hP = new HomePage();
		AssertActions aA = new AssertActions();
		
		//get the search parameters
		//File inFile = new File("src\\input\\FlightBookingInput.xlsx");
		File inFile = new File(in);
		String paramValues[] = gI.openInputFile(inFile);
		WebDriver driver = new FirefoxDriver();
		
		//set parameters
		String launchURL = gI.getLaunchURL(paramValues);
		String travelType = gI.getTravelType(paramValues);
		String bookingType = gI.getBookingType(paramValues);
		String travelOrigin = gI.getTravelOrigin(paramValues);
		String travelDestination = gI.getTravelDestination(paramValues);
		String departureDate = gI.getDepartureDate(paramValues);
		String returnDate = gI.getReturnDate(paramValues);
		
		//Launch homepage
		driver.get(launchURL);
		aA.pageTitle(driver,"MakeMyTrip, India's No 1 Travel Site | Book Flights, Hotels, Holiday Packages & Bus Tickets");
		
		//Enter the search criteria
		//(hP.flightsTab(driver)).click();		
		if(travelType.equals("Domestic"))
			hP.domesticTravel(driver).click();
		
		if(bookingType.equals("RoundTrip"))
			hP.roundTrip(driver).click();
		
		hP.departureAirport(driver).sendKeys(travelOrigin,Keys.TAB);
		hP.destinationAirport(driver).sendKeys(travelDestination,Keys.TAB);
		
		hP.departureDate(driver,departureDate);
		hP.returnDate(driver,returnDate);
		
		//submit the search
		hP.flightsSubmit(driver).click();
	}
	
	public String[] selectFlights(String sortOrder){
		String [] flightNumbers = new String[2];
		
		
		return flightNumbers;
	}
	
	public void bookingSummary(String[] flightDetails){
		
	}
	
}
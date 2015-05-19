package testCase;

import java.io.File;
import java.io.IOException;

import helperFunctions.*;
import uiMap.HomePage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;

//import static org.testng.AssertJUnit.*;

import org.testng.annotations.*;




public class FlightBooking{
	
	
	@Test
	public void domesticBooking() throws IOException{
		
		GetInputs gI = new GetInputs();
		HomePage hP = new HomePage();
		AssertActions aA = new AssertActions();
		
		//get the search parameters
		File inFile = new File("src\\input\\FlightBookingInput.xlsx");
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
		hP.flightsTab(driver).click();		
		if(travelType.equals("Domestic"))
			hP.domesticTravel(driver).click();
		
		if(bookingType.equals("RoundTrip"))
			hP.roundTrip(driver).click();
		
		hP.departureAirport(driver,travelOrigin);
		hP.destinationAirport(driver,travelDestination);
		
		hP.departureDate(driver).sendKeys(departureDate);
		hP.returnDate(driver).sendKeys(returnDate);
		
		//submit the search
		hP.flightsSubmit(driver).click();
		
		
	}
	
	
}
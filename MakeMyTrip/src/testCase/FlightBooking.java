package testCase;

import java.io.IOException;

import helperFunctions.*;
import uiMap.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.*;

import org.testng.annotations.*;




public class FlightBooking{
	
	
	@Test
	public void domesticBooking() throws IOException{
		
		GetInputs gI = new GetInputs();
		HomePage hP = new HomePage();
		AssertActions aA = new AssertActions();
		
		//get the search parameters
		gI.openInputFile("FlightBookingInput.xlsx");
		WebDriver driver = new FirefoxDriver();
		
		//Launch homepage
		driver.get(launchURL);
		pageTitle(driver,"");
		
		//Enter the search criteria
		hP.flightsTab(driver).click();		
		if(travelType.equals("Domestic"))
			hP.domesticTravel(driver).click();
		
		if(BookingType.equals("RoundTrip"))
			hP.roundTrip(driver).click();
		
		hP.departureAirport(driver).sendKeys(travelOrigin);
		hP.destinationAirport(driver).sendKeys(travelDestination);
		
		
	}
	
	
}
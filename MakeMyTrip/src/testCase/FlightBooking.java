package testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Modules.*;


public class FlightBooking{
	
	@Test
	public void domesticBooking() throws IOException{
		
		WebDriver driver = new FirefoxDriver();
		//new SearchBooking().loadSearchCriteria(driver,"/sts/workspace/gitrepo/MakeMyTrip/MakeMyTrip/src/input/FlightBookingInput.xlsx");
		driver = new SearchBooking().loadSearchCriteria(driver,"src\\input\\FlightBookingInput.xlsx");
		
		driver = new SelectFlight().selectCheapFlights(driver);
		driver = new ReviewBooking().reviewItinerary(driver);
		
		driver.close();
	}
	
}
package Modules;

import helperFunctions.AssertActions;
import org.openqa.selenium.WebDriver;
import uiMap.AvailabilityPage;

public class SelectFlight{
	
	public void selectCheapFlights(WebDriver driver){
		
		new AssertActions().pageTitle(driver, "Flight Split Listing View");
		AvailabilityPage aP = new AvailabilityPage();
		aP.verifySearchCriteria(driver);
		
		String onwardItinerary = "Onward Flight:"+aP.onwardCheapFlight(driver)+"\nDeparture Time:"+aP.onwardDepTime(driver)
								 +"\nArrival Time"+aP.onwardArrTime(driver)+"\nFare:"+aP.onwardFare(driver);
		
		String returnItinerary = "Return Flight:"+aP.returnCheapFlight(driver)+"\nDeparture Time:"+aP.returnDepTime(driver)
				 +"\nArrival Time"+aP.returnArrTime(driver)+"\nFare:"+aP.returnFare(driver);
		
		String totalFare = aP.totalFare(driver);
		
		System.out.println(onwardItinerary);
		System.out.println(returnItinerary);
		System.out.println(totalFare);
		
		aP.bookFlight(driver).click();
		aP.onPriceUp(driver,"continue").click();
		
		setOnwardItinerary(onwardItinerary);
		setReturnItinerary(returnItinerary);
		setTotalItinerary(totalFare);
		
		new AssertActions().pageTitle(driver, "Flights Review");
	}
	
	public String setOnwardItinerary(String onwardItinerary){
		return onwardItinerary;
	}
	public String setReturnItinerary(String returnItinerary){
		return returnItinerary;
	}
	public String setTotalItinerary(String totalFare){
		return totalFare;
	}
}
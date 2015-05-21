package Modules;

import helperFunctions.AssertActions;
//import Modules.SelectFlight;

import org.openqa.selenium.WebDriver;

import uiMap.ReviewPage;


public class ReviewBooking{

	public WebDriver reviewItinerary(WebDriver driver){
		
		new AssertActions().pageTitle(driver, "Flights Review");
		ReviewPage rP = new ReviewPage();
		
		String onwardItinerary = "Onward Flight:"+rP.onwardFlightReview(driver)+"\nDeparture Time:"+rP.onwardDepTime(driver)
				 +"\nArrival Time"+rP.onwardArrTime(driver)+"\nFare:";
		
		String returnItinerary = "Return Flight:"+rP.returnFlightReview(driver)+"\nDeparture Time:"+rP.returnDepTime(driver)
				 +"\nArrival Time"+rP.returnArrTime(driver)+"\nFare:";
		
		System.out.println(onwardItinerary);
		System.out.println(returnItinerary);
		
		return driver;
	}
}
package testCase;

import java.io.IOException;
import org.testng.annotations.*;

import Modules.*;


public class FlightBooking{
	
	@Test
	public void domesticBooking() throws IOException{
		SearchBooking sB = new SearchBooking();
		sB.loadSearchCriteria("/sts/workspace/gitrepo/MakeMyTrip/MakeMyTrip/src/input/FlightBookingInput.xlsx");
		String[] flightDetails = sB.selectFlights("cheapest");
		sB.bookingSummary(flightDetails);
		
	}
	
}
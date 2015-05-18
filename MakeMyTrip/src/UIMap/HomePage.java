//This file identifies all the web elements required to enter a search criteria on the HomePAge

package uiMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.AssertJUnit.*;

public class HomePage{
	
	//Select country
	public void selectCountry(String countryName,WebDriver driver){
		
		//driver.findElement(By.className("chf_indian_flag_big chf_flL")).isDisplayed();
		assertTrue(driver.findElement(By.id("country_links")).isDisplayed());
		driver.findElement(By.className("chf_flL chf_dropdown_arrow")).click();
		
		
	}
	
	//Flight tab
	public WebElement flightsTab(WebDriver driver){	
		return driver.findElement(By.cssSelector("a[href='http://www.makemytrip.com/flights']"));
	}
	
	//Domestic option
	public WebElement domesticTravel(WebDriver driver){	
		return driver.findElement(By.linkText("Domestic"));
	}
	
	//Round trip type
	public WebElement roundTrip(WebDriver driver){	
		return driver.findElement(By.id("round_trip_button1"));
	}
	
	//Origin airport
	public WebElement departureAirport(WebDriver driver){	
		return driver.findElement(By.cssSelector("input[@placeholder='Type Departure City']"));
	}
	
	//Destination airport
	public WebElement destinationAirport(WebDriver driver){	
		return driver.findElement(By.cssSelector("input[@placeholder='Type Destination City']"));
	}
	
	//DepartureDate
	public WebElement departureDate(WebDriver driver){
		driver.findElement(By.id("start_date_sec")).click();
		(driver.findElement(By.id("ui-datepicker-div"))).isDisplayed();
		return driver.findElement(By.className("ui-datepicker-group ui-datepicker-group-first"));
		
	}
	
	//ReturnDate
	public WebElement returnDate(WebDriver driver){
		driver.findElement(By.id("return_date_sec")).click();
		(driver.findElement(By.id("ui-datepicker-div"))).isDisplayed();
		return driver.findElement(By.className("ui-datepicker-group ui-datepicker-group-first"));	
	}
	
	//flights submit button
	public WebElement flightsSubmit(WebDriver driver){
		return driver.findElement(By.id("flights_submit"));
	}
	
	//search confirmation
	public WebElement searchConfirmation(WebDriver driver){
		driver.findElement(By.className("modal-content overlay_cases")).isDisplayed();
		return driver.findElement(By.className("btn btn-md btn-block btn-primary-red popUp_flightSearch"));
	}
	
	
	//Search in progress window
	public boolean searchInProgress(WebDriver driver){
		return driver.findElement(By.className("intersitial overlay_cases clearfix col-lg-12 col-md-12 col-sm-12 col-xs-12")).isDisplayed();
	}
}
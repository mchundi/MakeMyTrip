//This file identifies all the web elements required to enter a search criteria on the HomePAge

package uiMap;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

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
		WebElement a = driver.findElement(By.cssSelector("a[href='http://www.makemytrip.com/flights']"));
		System.out.println(a);
		return a;
	}
	
	//Domestic option
	public WebElement domesticTravel(WebDriver driver){	
		WebElement a = driver.findElement(By.linkText("Domestic"));
		System.out.println(a);
		return a;
	}
	
	//Round trip type
	public WebElement roundTrip(WebDriver driver){	
		WebElement a = driver.findElement(By.id("round_trip_button1"));
		System.out.println(a);
		return a;
	}
	
	//Origin airport
	public WebElement departureAirport(WebDriver driver){	
		return driver.findElement(By.cssSelector("input[placeholder='Type Departure City']"));
	}
	
	//Destination airport
	public WebElement destinationAirport(WebDriver driver){	
		WebElement a = driver.findElement(By.cssSelector("input[placeholder='Type Destination City']"));
		System.out.println(a);
		return a;
	}
	
	//DepartureDate
	public void departureDate(WebDriver driver,String startDate){
		driver.findElement(By.id("start_date_sec")).click();
		(driver.findElement(By.id("ui-datepicker-div"))).isDisplayed();
		/*
		 driver.findElement(By.className("ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today")).click();
		 Calendar javaCalendar = Calendar.getInstance();
		 String stDate = (javaCalendar.get(Calendar.DATE)) + "-" + (javaCalendar.get(Calendar.MONTH) + 1) + "-" + javaCalendar.get(Calendar.YEAR);
		 driver.findElement(By.cssSelector("class[fare-date='"+stDate+"']")).click();
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[11]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
	}
	
	//ReturnDate
	public void returnDate(WebDriver driver,String returnDate){
		
		driver.findElement(By.id("return_date_sec")).click();
		(driver.findElement(By.id("ui-datepicker-div"))).isDisplayed();
		/*
		Calendar javaCalendar = Calendar.getInstance();
		String rtnDate = (javaCalendar.get(Calendar.DATE)+1) + "-" + (javaCalendar.get(Calendar.MONTH) + 1) + "-" + javaCalendar.get(Calendar.YEAR);
			
		driver.findElement(By.cssSelector("class.fare-date="+rtnDate)).click();
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[11]/div[2]/table/tbody/tr[4]/td[5]/a")).click();
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
package uiMap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailabilityPage{
	
	public WebElement footer(WebDriver driver){
		return driver.findElement(By.className("sticky_bottom"));
	}
	
	public boolean verifySearchCriteria(WebDriver driver){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[1]/div/div[1]")).isDisplayed();
		String depDestAirport = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div[1]/div/div[1]/div/a[1]/p")).getText();
		return depDestAirport.equals("Bangalore to New Delhi");
	}
	
	public String onwardCheapFlight(WebDriver driver){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[4]/a[2]")).click();
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[1]/span[2]")).getAttribute("title");
	}
	
	public String returnCheapFlight(WebDriver driver){
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[4]/a[2]")).click();
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/span[2]")).getAttribute("title"); 
	}
	
	public String onwardDepTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[2]/p[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[2]/p[1]")).getText();
	}
	
	public String onwardArrTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[4]/p[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[4]/p[1]")).getText();
	}
	
	public String onwardFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[5]/p[1]")).getText();
	}
	
	public String returnDepTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/p[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/p[1]")).getText();
	}
	
	public String returnArrTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[4]/p[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[4]/p[1]")).getText();
	}
	
	public String returnFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[5]/p[1]")).getText();
	}
	
	public String totalFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[3]/div/div[2]/div/p[2]")).getText();
	}
	
	public WebElement bookFlight(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[3]/div/div[2]/span/span[2]/a"));
	}
	
	public WebElement onPriceUp(WebDriver driver,String action){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(By.id("fcModalBody")).isDisplayed() && action.equals("continue"))
			return driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div/div/div[7]/div[2]/div/a"));
		else
			return driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div/div/div[7]/div[1]/div/a"));
	}
}


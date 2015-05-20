package uiMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewPage{
	
	public String onwardFlightReview(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[1]/span[2]/span[1]")).getText()
				+" "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[1]/span[2]/span[2]")).getText();
	}
	
	public String returnFlightReview(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[1]/span[2]/span[1]")).getText()
				+" "+driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[1]/span[2]/span[2]")).getText();
	}
	
	public String onwardDepTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[2]/span[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[2]/span[1]")).getText();
	}
	
	public String onwardArrTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[4]/span[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/div/div[2]/div/div[4]/span[1]")).getText();
	}
	/*
	public String onwardFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[1]/div/div[5]/p[1]")).getText();
	}
	*/
	public String returnDepTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[2]/span[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[2]/span[1]")).getText();
	}
	
	public String returnArrTime(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[4]/span[2]")).getText()
				+ driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/span[2]/div/div[2]/div/div[4]/span[1]")).getText();
	}
	/*
	public String returnFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[5]/p[1]")).getText();
	}
	*/
	public String totalFare(WebDriver driver){
		return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/p/span[2]")).getText();
	}
}
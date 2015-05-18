//this file verifies the title of each page to ensure that the right page is loaded

package helperFunctions;

import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.*;


public class AssertActions{
	
	//Verify title of Page
	public void pageTitle(WebDriver driver, String expectedTitle){
		String actualTitle = driver.getTitle(); 
		assertEquals(actualTitle,expectedTitle);		
	}
	
}

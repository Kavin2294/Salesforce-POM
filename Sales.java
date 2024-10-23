package salesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseclassPOM;

public class Sales extends BaseclassPOM{
	
	public Sales(ChromeDriver driver) {
		this.driver= driver;
	}
	
	
	public OpportunityPage click_on_the_tab() {
	    WebElement Opp = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
	  JavascriptExecutor Executer = (JavascriptExecutor) driver;  
	  Executer.executeScript("arguments[0].click();", Opp);
		return new OpportunityPage(driver);

	}
	
}
	
	



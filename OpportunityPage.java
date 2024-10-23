package salesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseclassPOM;

public class OpportunityPage extends BaseclassPOM {
	
	public OpportunityPage(ChromeDriver driver) {
		this.driver= driver;
	}
	
	public OpportunityPage click_on_the_button() {
	    driver.findElement(By.xpath("//div[@title ='New']")).click();
	    return this;
	    
	}
	
public OpportunityPage new_opportunity_page_should_be_displayed(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("line 24");
			e.printStackTrace();
		}
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunity Information']"));
		String OI = opp.getText();
		System.out.println(OI);
		if (OI.equalsIgnoreCase("Opportunity Information")) {
			
			System.out.println("New Opportunity page is displayed");
			
		} else {
			System.out.println("New Opportunity page is not displayed");
		}
		
		return this;
		
	}

public OpportunityPage enter_the_opportunity_name_as() {
	
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Kavin");
	return this;
	
}

public OpportunityPage enter_amount_as() {

	driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
	return this;
	
}

public OpportunityPage choose_the_close_date_as_today() {

	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	driver.findElement(By.xpath("//button[@name='today']")).click();
	return this;
	
}

public OpportunityPage select_stage_as_need_analysis() throws InterruptedException {
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@aria-required='true']")).click();
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	return this;
}

public OpportunityPage click_on_the_button_and_verify_the_opportunity_name() {
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	return this;

}

public OpportunityPage opportunity_name_should_be_displayed() {

	WebElement Sfpage = driver.findElement(By.xpath("//span[@value='NewTask']"));
	String text = Sfpage.getText();
	System.out.println(text);
	if (text.equalsIgnoreCase("New Task")) {
		System.out.println("Opportunity created");
	} else {
		System.out.println("Opportunity not created");
	}
	return this;

}

}

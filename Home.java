package salesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseclassPOM;

public class Home extends BaseclassPOM{
	
	public Home(ChromeDriver driver) {
		this.driver= driver;
	}
	
	public Home toggle() {
	    driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
	    return this;

	}
	
	public Home click_on_view_all() {
	    driver.findElement(By.xpath("(//button[@class = \"slds-button\"])[2]")).click();
	    return this;
}
	
	public Sales select_from_the_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		return new Sales(driver);
}
	

}

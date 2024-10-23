package salesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseclassPOM;
import salesPOM.Home;

public class Loginpage extends BaseclassPOM {
	
	public Loginpage(ChromeDriver driver) {
		this.driver= driver;
	}
	
	public Loginpage uname() {
		 driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		 return this;

	}
	
	public Loginpage pword() {
	    driver.findElement(By.id("password")).sendKeys("leaf@2024");
	    return this;
	}
	
	public Loginpage clicklogin() {
	    driver.findElement(By.id("Login")).click();
	    return this;
	}
	
	public Home verify() {
		WebElement homepage = driver.findElement(By.xpath("(//span[text()='Home'])[3]"));
		   String hom = homepage.getText();
		   System.out.println(hom);
		   if (hom.equalsIgnoreCase("Home")) {
			   System.out.println("Home page is displayed");
			
		} else {
			System.out.println("Home page is not displayed");

		}
		   return new Home(driver);
		  		   
		
	}
	
	
	
	


}

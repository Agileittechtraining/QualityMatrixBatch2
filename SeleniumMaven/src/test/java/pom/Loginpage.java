package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Loginpage {
	WebDriver browser;
	public Loginpage(WebDriver browsername) {
		browser = browsername;		
	}
	public void loginpage() {
		browser.findElement(By.name("email")).sendKeys("user1@phptravels.com");
		browser.findElement(By.name("password")).sendKeys("demouser1");
		browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	    
	}
}

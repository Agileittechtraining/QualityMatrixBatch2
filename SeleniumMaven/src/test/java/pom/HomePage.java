package pom;

import org.openqa.selenium.WebDriver;


public class HomePage {
	WebDriver browser;
	public HomePage(WebDriver browsername) {
		browser = browsername;		
	}
	public void openurl() {
		browser.manage().window().maximize();
		browser.get("https://www.phptravels.net/login");
			}
}

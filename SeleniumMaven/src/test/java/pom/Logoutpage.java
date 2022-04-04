package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage {
	WebDriver browser;
	public Logoutpage(WebDriver browsername) {
		browser = browsername;		
	}

	public void logout() {
		 browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
}
}
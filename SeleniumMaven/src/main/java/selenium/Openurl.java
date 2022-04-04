package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
//webdriver.gecko.driver
//webdriver.edge.driver
//webdriver.safari.driver
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/");
		//cd.findElement(By.name("email")).sendKeys("use@facebook.com");
		cd.findElement(By.id("email")).sendKeys("user@facrbook.com");
	}

}

package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PHPPageAutomation {
	String Browsername = "chrome";
	WebDriver browser ;
	 
@BeforeTest
public void selectbrowsers() {
	if(Browsername.equalsIgnoreCase("FIREFOX")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
        browser = new FirefoxDriver();
	}else if(Browsername.equalsIgnoreCase("CHROME")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
        browser = new ChromeDriver();
	}else {
		Assert.fail("Please select Valid Browser as firefox or chrome");
	}
}
@Test(priority =1)
public void openurl() {
	String Expected = "Login - PHPTRAVELS";
	HomePage hm = new HomePage(browser);
	hm.openurl();
	Assert.assertEquals(browser.getTitle(), Expected);
}
@AfterTest
public void closebrowser() {
	browser.close();
}
@Test(priority =2, dependsOnMethods = "openurl")
public void loginpage() {
	String Expected = "Dashboard - PHPTRAVELS";
	Loginpage lp = new Loginpage(browser);
	lp.loginpage();
    Assert.assertEquals(browser.getTitle(), Expected);
}
@Test(priority =3)
public void extractdata() {
	MyBookingspage mp = new  MyBookingspage(browser);
	mp.extractdata();
    }

 @Test(priority =4)
 public void logout() {
 Logoutpage lp = new Logoutpage(browser);
 lp.logout();
 }
}


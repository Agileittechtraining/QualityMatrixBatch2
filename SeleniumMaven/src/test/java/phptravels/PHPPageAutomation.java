package phptravels;

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
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/login");
	Assert.assertEquals(browser.getTitle(), Expected);
}
@AfterTest
public void closebrowser() {
	browser.close();
}
@Test(priority =2, dependsOnMethods = "openurl")
public void loginpage() {
	String Expected = "Dashboard - PHPTRAVELS";
	browser.findElement(By.name("email")).sendKeys("user1@phptravels.com");
	browser.findElement(By.name("password")).sendKeys("demouser1");
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), Expected);
}
@Test(priority =3)
public void extractdata() {
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")).click();
    List<WebElement> bookingtype = browser.findElements(By.xpath("//table[@class='table  text-center']/tbody/tr/th[1]"));
    List<WebElement> status = browser.findElements(By.xpath("//table[@class='table  text-center']/tbody/tr/td[3]"));
    List<WebElement> date = browser.findElements(By.xpath("//table[@class='table  text-center']/tbody/tr/td[1]"));
    for(int i=0;i<bookingtype.size();i++) {
    	System.out.print(bookingtype.get(i).getText() + "------>");
    	System.out.print(date.get(i).getText() + "------>");
    	System.out.println(status.get(i).getText());
    }
}
 @Test(priority =4)
 public void logout() {
	 browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
 }
}


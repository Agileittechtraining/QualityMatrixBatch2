package cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage {
	WebDriver browser;
@Before
public void setproperties() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Installations\\chromedriver.exe");
}
@Given("I want to open a chrome browser")
public void openbrowser() {
	browser = new ChromeDriver();
	browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@And("I enter url of phptravels login")
public void openurl() {
	browser.get("https://www.phptravels.net/login");
}
@When("I enter username")
public void enterusername() {
	browser.findElement(By.name("email")).sendKeys("user@phptravels.com");	
}
@And("I enter password")
public void enterpassword() {
	browser.findElement(By.name("password")).sendKeys("demouser");
}
@And("I click Login button")
public void clicklogin() {
	browser.findElement(By.id("cookie_stop")).click();
	browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();	
}
@Then("I verify login page should open")
public void verifylogin() {
	String Expected = "Dashboard - PHPTRAVELS";
	Assert.assertEquals(browser.getTitle(), Expected);
}
}

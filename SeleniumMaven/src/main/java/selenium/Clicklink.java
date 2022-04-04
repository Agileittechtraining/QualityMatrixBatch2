package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clicklink {
  static WebDriver browser;
	public static void main(String[] args) {
		String browsername = "chrome";
		// TODO Auto-generated method stub
		if(browsername == "chrome") {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		browser =  new ChromeDriver();
	    }else if(browsername == "firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
			browser = new FirefoxDriver();	
		}else if(browsername == "edge") {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
			browser = new EdgeDriver();	
		}else {
			System.out.println("Please enter correct browser name");
		}
		browser.get("https://shopping.rediff.com/");
		browser.findElement(By.xpath("html/body/div[7]/div[2]/div[3]/div[5]/div[1]/div/div[1]/div/div/a")).click();
	

}
}

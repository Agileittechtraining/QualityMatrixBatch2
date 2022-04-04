package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
	    cd.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	    List<WebElement> companynames = cd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	    for(int i=0;i<companynames.size();i++) {
	    	System.out.println(companynames.get(i).getText());
	    }
	}

}

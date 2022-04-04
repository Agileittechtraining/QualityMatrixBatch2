package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyBookingspage {
	WebDriver browser;
	public MyBookingspage(WebDriver browsername) {
		browser = browsername;		
	}
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
}

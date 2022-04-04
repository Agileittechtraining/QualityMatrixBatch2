package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
	    cd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    cd.findElement(By.name("proceed")).click();
	    System.out.println(cd.switchTo().alert().getText());
	    cd.switchTo().alert().accept();
	}

}

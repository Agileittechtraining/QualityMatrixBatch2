package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtractText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		//cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    cd.get("https://echoecho.com/javascript4.htm");
	    WebDriverWait wd = new WebDriverWait(cd, Duration.ofSeconds(30));
	    wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div")));
	    String str = cd.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tboy/tr/td/div")).getText();
        System.out.println(str);
	}

}

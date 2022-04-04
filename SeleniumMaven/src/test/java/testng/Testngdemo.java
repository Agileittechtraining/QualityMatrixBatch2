package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngdemo {
@Test(priority = 1)
public void openurl() {
	System.out.println("This is from testng testcase");
	//Assert.assertEquals("A", "B");
	SoftAssert sa = new SoftAssert();
	sa.assertEquals("A", "B");
	System.out.println("Second line");
	System.out.println("Third Line");
	sa.assertAll();
}
@Test(priority = 2,dependsOnMethods = "openurl" )
public void findelements() {
	System.out.println("This is from my second testngtestcase");
}
@BeforeTest
public void precondition() {
	System.out.println("This is a precondition");
}
@AfterTest
public void postcondition() {
	System.out.println("This is a post condition");
}
}

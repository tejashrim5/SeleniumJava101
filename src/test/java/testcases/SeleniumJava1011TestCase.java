package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class SeleniumJava1011TestCase extends TestBase{

	@Test
	public void SeleniumJava101_TC1() throws MalformedURLException {
		setUp("Chrome");
		driver().get("https://www.lambdatest.com/selenium-playground/");
		driver().findElement(By.xpath("//a[contains(text(),'Simple Form Demo')]")).click();
		Assert.assertTrue(driver().getCurrentUrl().contains("simple-form-demo"));
		String text = "Welcome to LambdaTest";
		driver().findElement(By.id("user-message")).sendKeys(text);
		driver().findElement(By.id("showInput")).click();
		String actualText = driver().findElement(By.cssSelector("[id='message']")).getText();
		Assert.assertEquals(actualText, text);
		driver().quit();
		
	}
}

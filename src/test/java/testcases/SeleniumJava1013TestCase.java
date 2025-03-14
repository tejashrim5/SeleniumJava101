package testcases;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class SeleniumJava1013TestCase extends TestBase{
	
	@Test
	public void SeleniumJava101_TC3() throws MalformedURLException, InterruptedException {
		setUp("Edge");
		driver().get("https://www.lambdatest.com/selenium-playground/");
		driver().findElement(By.xpath("//a[contains(text(),'Input Form Submit')]")).click();
		driver().findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(1000);
		String actualErrorMessage = driver().findElement(By.xpath("//input[@id='name']")).getAttribute("validationMessage");
		Assert.assertEquals(actualErrorMessage, "Please fill out this field.");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("name")).sendKeys("Test");
		
		Thread.sleep(2000);
		
		driver().findElement(By.xpath("//input[@id='inputEmail4']")).sendKeys("Test@email.com");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("password")).sendKeys("Password$123");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("company")).sendKeys("Test company");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("website")).sendKeys("www.testwebsitee.com");
		
		Thread.sleep(1000);
		
		Select select = new Select(driver().findElement(By.xpath("//select[@name='country']")));
		select.selectByVisibleText("United States");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("city")).sendKeys("Test city");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("address_line1")).sendKeys("Test address 1");
		
		Thread.sleep(1000);
		
		driver().findElement(By.name("address_line2")).sendKeys("Test address 2");
		
		Thread.sleep(1000);
		
		driver().findElement(By.id("inputState")).sendKeys("Test state");
		
		Thread.sleep(1000);
		
		driver().findElement(By.id("inputZip")).sendKeys("Test zip");
		
		Thread.sleep(1000);
		
		driver().findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		Thread.sleep(1000);
		
		Assert.assertTrue(driver().findElement(By.xpath("//p[contains(text(),'Thanks for contacting us, we will get back to you shortly.')]")).isDisplayed());
		
		driver().quit();
	}

}

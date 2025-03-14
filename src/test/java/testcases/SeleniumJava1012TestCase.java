package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.TestBase;

public class SeleniumJava1012TestCase extends TestBase{

	@Test
	public void SeleniumJava101_TC2() throws MalformedURLException {
		setUp("Edge");
		driver().get("https://www.lambdatest.com/selenium-playground/");
		driver().findElement(By.xpath("//a[contains(text(),'Drag & Drop Sliders')]")).click();
		
		WebElement drag = driver().findElement(By.xpath("//h4[contains(text(),'Default value 15')]//parent::div//div//input"));
		Actions action = new Actions(driver());
		action.dragAndDropBy(drag, 215, 0).perform();
		
		int outputValue = Integer.parseInt(driver().findElement(By.xpath("//h4[contains(text(),'Default value 15')]//parent::div//div//output")).getText());
		
		Assert.assertEquals(outputValue, 95);
		driver().quit();
		
	}
}

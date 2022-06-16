package Automation.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends Access
{
	@Test(priority = 3)
	public void contactUs() throws Throwable
	{
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		WebElement element3 = driver.findElement(By.className("title"));
		Assert.assertTrue(element3.isDisplayed());
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Arijit Roy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("royarijit800@gmail.com");
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("6295257700");
		driver.findElement(By.xpath("//*[@name='message']")).sendKeys("a quick brown fox jumps over the lazy dog");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());
		String elem4 = driver.getTitle();
		if(elem4.equals("Mobile"))
		{
			System.out.println("Test case is successfull");
		}else {
			System.out.println("Test case is failed");
		}
	}
}



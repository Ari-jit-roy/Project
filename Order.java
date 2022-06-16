package Automation.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.KeyEvent;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Order extends Home
{
	@Test(priority = 3)
	public void Order() throws InterruptedException, AWTException{

		Set<String> window = driver.getWindowHandles();

		Iterator<String>it = window.iterator();
		Thread.sleep(2000);
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
		driver.findElement(By.id("inputFirstName")).sendKeys("Arijit");
		driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("Roy");
		driver.findElement(By.id("inputEmail")).sendKeys("royarijit800@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Arijit123");
		driver.findElement(By.id("flexRadioDefault1")).click();
		driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("6295257700");
		driver.findElement(By.id(" address1")).sendKeys("Green garden layout");
		driver.findElement(By.id("address2")).sendKeys("Kundanahalli");
		driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
		WebElement dropdown = driver.findElement(By.id("inputState"));
		Select sle= new Select(dropdown);
		sle.selectByVisibleText("Karnataka");
		driver.findElement(By.id("inputZip")).sendKeys("560037");
		driver.findElement(By.xpath("//*[.='Apple']")).click();
		driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("2");
		WebElement dpdwn2 = driver.findElement(By.id("bought"));
		Select sle2= new Select(dpdwn2);
		sle2.selectByValue("0");
		driver.findElement(By.xpath("//*[@id='gridCheck1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);

		Robot roy=new Robot();
		for(int i=0;i<2;i++)
		{
			roy.keyPress(KeyEvent.VK_TAB);
		}
		roy.keyRelease(KeyEvent.VK_TAB);
		roy.keyPress(KeyEvent.VK_ENTER);
		roy.keyRelease(KeyEvent.VK_ENTER);

	}

}

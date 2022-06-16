package Automation.Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUp extends Access {
	@Test(priority = 4)
	public void Sigup() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[.='Sign up']")).click();
		WebElement fristname = driver.findElement(By.xpath("//input[@id='myName']"));
		fristname.sendKeys("Arijit");
		WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Last_name.sendKeys("Roy");
		WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
		Email.sendKeys("royarijit800.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
		password.sendKeys("Arijit123");
		WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
		Phone_number.sendKeys("6295257700");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
		bio_story.sendKeys("You Know Who");
		driver.findElement(By.xpath("//input[@type='date']")).click();
		driver.findElement(By.xpath("//button[@type='Submit']")).click();
		Alert Al = driver.switchTo().alert();
		Al.accept();
		Thread.sleep(1000);
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		user_name.click();
		user_name.sendKeys("royarijit800@gmail.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.click();
		Password.sendKeys("Arijit123");
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		Thread.sleep(1000);
	}
}



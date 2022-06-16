package Automation.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Access{
	WebDriver driver;
	@Test
	public void Lanching_the_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\Project\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.manage().window().maximize();

		}
	}




package in_TripAdvisor_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.tripadvisor.in/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("Club Mahindra");
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
	}

}

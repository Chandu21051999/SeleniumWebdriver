package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderClass {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test
	public void Login() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Chandu@122.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		}

		
	}
	@AfterClass
	public void tearDown() {
		
	}
}

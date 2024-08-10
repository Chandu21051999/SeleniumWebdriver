package TestNGClass;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*login the application
Open the application 
test logo is present
login 
close
*/
public class LoginPage {
	WebDriver driver;
	@Test(priority=1)
	public void Openapp() {
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@Test(priority=2)
	public void testlogo() throws InterruptedException {
       boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
       System.out.println("logo is displayed........"+status);
       
        
	}
	@Test(priority=3)
	public void testlogin() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button['normalize-space()-Login']")).click();

		//System.out.println();
	}
	@Test(priority=4)
	public void logout() {
		//System.out.println();
	}



}

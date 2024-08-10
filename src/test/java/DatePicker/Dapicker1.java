package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dapicker1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//switch to frame
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		//Thread.sleep(2000);
		
		String ear ="2024";
		String month="may";
		String Date ="22";
			
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		
		while(true) {
			
		//string CurrentMonth = driver.findElement(((By.xpath("//span[@class='ui-datepicker-month']")).getText();
		//String CurrentYear = driver.findElement(By.xpath(("//span[@class='ui-datepicker-year']")).getText();
		
		
		}
		
		}

}

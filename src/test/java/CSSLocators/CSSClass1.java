package CSSLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSClass1 {

	public static void main(String[] args) {
  
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//by using tag name:tagname is optional ----->tagname#ID
		//driver.findElement(By.cssSelector("inpput#small-searchterms")).sendKeys("Mobiles");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobiles");
		//tag adn class :tagname.Class
		//driver.findElement(By.cssSelector("input.search-box-text ")).click();
		//driver.close();
		//tag and attribute:tagname[attribute='value']
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("books");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("books");
		
		//tag class and attribute:	tagname.Classname[Attribute='value']
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Mobiles");

		
		
	}

}

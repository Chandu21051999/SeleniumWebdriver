package basicscript;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass {

	public static void main(String[] args) throws Exception {


		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opencart.com");		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search']"));
		Thread.sleep(2000);
		//LInkedText
		//driver.findElement(By.linkText("Components")).click();
		//Partail LinkedText		
		//driver.findElement(By.partialLinkText("Compo")).click();	
		
		//by using class name
		//List<WebElement>headerlink=driver.findElements(By.className("list-inline-item"));
		//System.out.println("total no of headerlinks:+"+headerlink.size());
		//using the Tag name
		List<WebElement>Lists=driver.findElements(By.tagName("a"));
		System.out.println("Total No of Lists:" +Lists.size());
		//list of images
		List<WebElement>images=driver.findElements(By.tagName("images"));
		System.out.println("List of Images:" + images.size());
		driver.close();
		
		
		
	}

}

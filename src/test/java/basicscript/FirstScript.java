package basicscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 * testcase
 1.first launch program
 2.Open URl:https:demo.opencart.com
 3.validate title should be "your store"
 4.CLose
 */

public class FirstScript {

	public static void main(String[] args) {
		//1.launch the browser
		//ChromeDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		//Webdriver driver1=new EdgeDriver();
		
		driver.manage().window().maximize();
		//open Url:
		//get method open the Url
		driver.get("https://demo.opencart.com");
		//to capture the title
		String actualtitle=driver.getTitle();
		
		if(actualtitle.equals("Your Store"))
		
		{
			System.out.println("Test Case passed");
		}
		
		else {
			System.out.println("Test case failed");
		}
		
		
		//Close the browser
		driver.close();
		
	}

}

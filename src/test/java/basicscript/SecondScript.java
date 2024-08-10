package basicscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SecondScript {

	public static void main(String[] args) throws Exception {

//launch Url
		
		WebDriver driver=new ChromeDriver();
		//Url
		driver.get("https:demo.nopCommerce.com/");
		//get title
		
		String act_title=driver.getTitle();
		Thread.sleep(2000);
		
		if(act_title.equals("nopCommerce demo Store")) {
			System.out.println("Test case passed");
			
		}
		else {
			System.out.println("Test case is failed");
		}
		
		//close
		driver.close();
	}

}

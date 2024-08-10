package TestNG;

import org.testng.annotations.Test;

public class FirstTestNG {
	
	@Test(priority=1)
	public void Openapp() {
		System.out.println("OPening in the applicaion");
	}

	@Test(priority=2)
	public void Login() {
		System.out.println("Login in the page");
		
	}
	@Test(priority=3)
	public void Logout() {
		System.out.println("Logout the page");
		
	}
}

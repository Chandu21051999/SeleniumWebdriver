package DependencyMethod;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1,groups= {"sanity"})
	public void LoginByemail() {
		System.out.println("this is the email login");
		
	}

	@Test(priority=2 ,groups= {"sanity"})
	public void LoginByMobilenumber() {
		System.out.println("this is the mobile number");
		
	}
	@Test(priority=3 ,groups= {"sanity"})
	public void LoginByFaceBook() {
		System.out.println("this is the Facebook");
		
	}


}

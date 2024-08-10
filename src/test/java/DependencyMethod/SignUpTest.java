package DependencyMethod;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test(priority=1 ,groups= {"regression"})
	public void SignupByemail() {
		
		System.out.println("this is the signup by  email");
	}

	@Test(priority=2 ,groups= {"regression"})
	public void SignupByMobileNumber() {
		
		System.out.println("this is the  sign up by Mobile number");
	}

	@Test(priority=3 ,groups= {"regression"})
	public void SignupByFaceBook() {
		
		System.out.println("this is the sign up by  Facebook");
	}

	
}

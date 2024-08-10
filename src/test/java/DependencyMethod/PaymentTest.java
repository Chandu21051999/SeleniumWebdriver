package DependencyMethod;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=1 ,groups= {"sanity","regression" ,"functional"})
	void PaymentByPhonepay() {
		
		System.out.println("this is payment by phone pay");
	}
	@Test(priority=2 ,groups= {"sanity","regression","functional"})
	void PaymentByGooglepay() {
		
		System.out.println("this is payment by google pay");
	}

	@Test(priority=3 ,groups= {"sanity","regression","functional"})
	void PaymentBypaytm() {
		
		System.out.println("this is payment by  paytm");
	}

}

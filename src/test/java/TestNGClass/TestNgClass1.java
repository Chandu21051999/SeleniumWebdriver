package TestNGClass;

import org.testng.annotations.Test;

public class TestNgClass1 {
	
	@Test(priority=0)
      public void testcase1() {
		System.out.println("test case 1");
	}

	@Test(priority=2)
	public void testcase2() {
		System.out.println("Test case2");
	}
	@Test(priority=1)
	public void testcase3() {
		System.out.println("Test case3");
	}
}

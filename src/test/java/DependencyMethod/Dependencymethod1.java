package DependencyMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethod1 {

	@Test(priority=1)
	public void Openapp() {
		Assert.assertTrue(true);
		
	}
	@Test(priority=2 ,dependsOnMethods= {"Openapp"})
	public void Login() {
		Assert.assertTrue(true);
		
	}
	@Test(priority=3 ,dependsOnMethods= {"Login" ,"Search"})
	public void Search() {
		Assert.assertTrue(true);
		
	}
	@Test(priority=4 ,dependsOnMethods= {"Login"})
	public void AdvSearch() {
		Assert.assertTrue(true);
		
	}
	@Test(priority=5 ,dependsOnMethods= {"Login"})
	public void Logout() {
		Assert.assertTrue(true);
		
	}
}

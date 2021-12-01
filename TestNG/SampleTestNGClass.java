package TestNG;

import org.testng.annotations.Test;

public class SampleTestNGClass {
	
	@Test(enabled = true)
	public void firstTestcase () {
		System.out.println("This is the first test case");
	}
	
	@Test(dependsOnMethods = "firstTestcase")
	public void secondTestcase (){
		System.out.println("This is the second test case");
	}
	
	@Test
	public void thirtdtTestcase () {
		System.out.println("This is the third test case");
	}
	
	@Test(groups = {"GroupSample"})
	public void fourthTestcase () {
		System.out.println("This is the fourth test case");
	}

}

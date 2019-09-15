package tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import utils.WebDriversFunction;

public class SkipEnabledDisabled extends WebDriversFunction {
	@Test
	public void skipTest() {
		System.out.println("Test method skiped");
		throw new SkipException("This test will be skipped");
	}
	
	@Test(enabled = false)
	public void enabledfalse() {
		//This test will not run or show up in report
	}
	
	@Test(enabled = true)
	public void enabledTrue() {
		System.out.println("This test will run since it is enabled");
	}
}

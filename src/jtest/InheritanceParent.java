package jtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InheritanceParent {

	
	@BeforeMethod
	public void methodPBefore()
	{
		System.out.println("PARENT : Before method");
	}
	
	
	
	public void runme()
	{
		System.out.println("RUN ME");
	}
	
	@AfterMethod
	public void PAftermethod()
	{
		System.out.println("PARENT : After method");
	}
	
	
}

package jtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InheritanceChild extends InheritanceParent
{

	@Test
	public void childMethod()
	{
		int a=3;
		Abcd ab=new Abcd(a);
		// int res=ab.increment(a);
		System.out.println(ab.increment());
		System.out.println(ab.decrement());
		System.out.println(ab.Multiply2());
		System.out.println(ab.Multiply4());
		
		System.out.println("Git Demo updated");
		
		/*
		 * Xyz xy=new Xyz(3); System.out.println(xy.Multiply2());
		 * System.out.println(xy.Multiply4());
		 */
		
		
	runme();
	}
	
	
	@AfterMethod
	public void CAftermethod()
	{
		System.out.println("CHILD : After method");
	}
	
	@BeforeMethod
	public void CBeforemethod()
	{
		System.out.println("CHILD : Before method");
	}
}

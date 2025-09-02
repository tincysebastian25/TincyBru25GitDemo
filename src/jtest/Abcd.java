package jtest;

import org.testng.annotations.Test;

public class Abcd extends Xyz{

	
	int a;
	 public Abcd(int a)
	 { super(a); this.a=a;
	 
	 }
	  
	 public int increment() 
	 { a=a+1; return a; }
	  
	  public int decrement() 
	  { a=a-1; return a; }
	 
	
	
	
}

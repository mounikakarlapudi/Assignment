package testngTutorials;

import org.testng.annotations.Test;

public class Program1 {
	
	@Test
	public void loginApplication(){
		System.out.println("this is my 1st testng program");
		
	}
	@Test
	public void SelectWindow(){
		System.out.println("Window selected");
	}

	@Test
	public void EnterCredentials(){
		System.out.println("correct credentials entered");
	}
}

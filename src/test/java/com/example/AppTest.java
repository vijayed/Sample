package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AppTest{ 
    
	@Test
	public void itShouldAddTwoNumber(){
		int a =10;
		int b = 20;
		int expected = 30;
		
		App obj = new App();
		
		int actual = obj.add(a,b);
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	public void itShouldSubtractTwoNumbers(){
		int a=40;
		int b=10;
		int expected = 30;
		
		App obj = new App();
		
		int actual = obj.sub(a,b);
		assertEquals(actual,expected);
		
	}

}

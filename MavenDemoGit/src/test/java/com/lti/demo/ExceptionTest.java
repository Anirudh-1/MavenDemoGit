package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class ExceptionTest {

	// dev writes exceptions 
	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("one");}
				);
	}
	
	@Test
	public void testmethodExp() {
		Calculator c= new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class,
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("You entered zero",e.getMessage());
	}

}

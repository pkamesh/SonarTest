package com.example.demosonar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSonarApplicationTests {

	@Test
	public void contextLoads() {
	
		Testcontroller t=new Testcontroller();
		String getmethod = t.getmethod();
	    assertEquals("success",getmethod);
	}
	@Test
	public void testservice() {
		TestService ts=new TestService();
		ts.nice();
		assertTrue(true);
		
		
	}
	
	
	

}

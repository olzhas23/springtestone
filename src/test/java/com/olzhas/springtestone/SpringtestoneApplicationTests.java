package com.olzhas.springtestone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringtestoneApplicationTests {

	@Autowired
	private CheckPalindrome controller;

	@Test
	public void setController(){
		assert(controller).palindrome("racecar").equals("yes");
	}



}

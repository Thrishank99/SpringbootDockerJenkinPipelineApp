package com.org.java.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.org.java.junit.Calculater;

@SpringBootTest
public class JavaUnitTest {
	
	@Autowired
	Calculater calculater;
	
	@Test
	public void addTest() {
		int actuals=calculater.add(5, 4);
		assertEquals(9, actuals);
	}
	@Test
	public void subTest() {
		int actual=calculater.sub(25, 10);
		assertEquals(15, actual);
	}
	@Test
	public void mulTest() {
		int actual=calculater.multy(25, 10);
		assertEquals(250, actual);
	}
	@Test
	public void divideTest() {
		int actual=calculater.divide(110, 10);
		assertEquals(11, actual);
	}

}

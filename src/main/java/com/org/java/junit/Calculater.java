package com.org.java.junit;

import org.springframework.stereotype.Component;

@Component
public class Calculater {
	
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int multy(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}

}

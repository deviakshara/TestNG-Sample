package com.gso.test;

import org.testng.annotations.Test;

import com.gso.Calculator;

public class testCalc {
  @Test
  public void f() {
	  Calculator obj = new Calculator();
	  obj.Sum(10, 20);
  }
}

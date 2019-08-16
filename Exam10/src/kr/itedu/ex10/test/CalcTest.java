package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(30,Calc.sum(10,20));
		assertEquals(40,Calc.sum(10,30));
		assertEquals(50,Calc.sum(30,20));
	}

}

package br.pucrs.alav;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecursionTests {

	public static void main(String[] args){
		test();
	}

	@Test
	public static void test() { 
		//1
		AssertEquals(Recursion.mult(6,4),24);

		//2
		AssertEquals(Recursion.inc(3,2),5);

		//3
		AssertEquals(Recursion.div(2),1.5);

		//4
		AssertEquals(Recursion.inv("teste"),"etset");

		//5
		AssertEquals(Recursion.seq(3),7);

		//6
		AssertEquals(Recursion.seqAck(3,4),125);
	}

}

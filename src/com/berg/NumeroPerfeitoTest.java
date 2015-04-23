package com.berg;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroPerfeitoTest {

	@Test
	public void testEDivisor() {
		
		NumeroPerfeito numPerfeito = new NumeroPerfeito();
		
		assertEquals( true, numPerfeito.eDivisor(10, 2) );
		assertEquals( false, numPerfeito.eDivisor(10, 3) );
		assertEquals( false, numPerfeito.eDivisor(10, 4) );
		assertEquals( true, numPerfeito.eDivisor(10, 5) );
		assertEquals( false, numPerfeito.eDivisor(10, 6) );
		assertEquals( false, numPerfeito.eDivisor(10, 7) );
		assertEquals( false, numPerfeito.eDivisor(10, 8) );
	}

	@Test
	public void testEPerfeito() {
		
		NumeroPerfeito numPerfeito = new NumeroPerfeito();
		
		assertEquals( false, numPerfeito.ePerfeito(1) );
		assertEquals( false, numPerfeito.ePerfeito(2) );
		assertEquals( false, numPerfeito.ePerfeito(3) );
		assertEquals( false, numPerfeito.ePerfeito(4) );
		assertEquals( false, numPerfeito.ePerfeito(5) );
		assertEquals( true, numPerfeito.ePerfeito(6) );
	}

}

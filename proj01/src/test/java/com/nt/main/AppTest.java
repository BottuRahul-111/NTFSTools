package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSunWithPositive() {
    	App App=new App();
    	int Expected=300;
    	int Actual=App.sum(100, 200);
        assertEquals(Expected,Actual);
    }
    
    @Test
    public void testSunWithNegative() {
    	App App=new App();
    	int Expected=-300;
    	int Actual=App.sum(-100, -200);
        assertEquals(Expected,Actual);
    }
    
    @Test
    public void testsSunWithMixed() {
    	App App=new App();
    	int Expected=100;
    	int Actual=App.sum(-100, 200);
        assertEquals(Expected,Actual);
    }
    
    @Test
    public void testsSunWithZeros() {
    	App App=new App();
    	int Expected=0;
    	int Actual=App.sum(0, 0);
        assertEquals(Expected,Actual);
    }
}

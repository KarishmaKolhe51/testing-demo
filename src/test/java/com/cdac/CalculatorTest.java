package com.cdac;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
        Calculator c = new Calculator();
        int actualValue = c.add(10, 20);
        int expectedValue = 30;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSub()
    {
        Calculator c = new Calculator();
        int actualValue = c.sub(10, 20);
        int expectedValue = -10;
        assertEquals(expectedValue, actualValue);
    }
}


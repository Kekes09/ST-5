package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SqrtTest {

    private static final double DELTA = 1e-6;


    @Test
    public void testAveragePositiveNumbers() {
        Sqrt sqrt = new Sqrt(4);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
    }

    @Test
    public void testAverageWithZero() {
        Sqrt sqrt = new Sqrt(4);
        assertEquals(2.5, sqrt.average(0.0, 5.0), DELTA);
    }

    @Test
    public void testAverageNegativeNumbers() {
        Sqrt sqrt = new Sqrt(4);
        assertEquals(-3.0, sqrt.average(-2.0, -4.0), DELTA);
    }


    @Test
    public void testGoodReturnsTrueWhenAccurate() {
        Sqrt sqrt = new Sqrt(4);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodReturnsFalseWhenInaccurate() {
        Sqrt sqrt = new Sqrt(4);
        assertFalse(sqrt.good(1.0, 4.0));
    }


    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4);
        assertEquals(2.5, sqrt.improve(1.0, 4.0), DELTA);
    }


    @Test
    public void testIterAlreadyGood() {
        Sqrt sqrt = new Sqrt(4);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), DELTA);
    }


    @Test
    public void testCalcSqrt4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSqrt2() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.41421356, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSqrt9() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSqrt1() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSqrtLargeNumber() {
        Sqrt sqrt = new Sqrt(10000.0);
        assertEquals(100.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSqrtFraction() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), DELTA);
    }
}
package xbonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XbonacciTest {
    private Xbonacci variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new Xbonacci();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    @Test
    public void basicTests() {
        assertArrayEquals(null, variabonacci.xbonacci(null, 10));
        assertArrayEquals(null, variabonacci.xbonacci(new double []{0,1}, -1));
        assertArrayEquals(null, variabonacci.xbonacci(null, -1));
        assertArrayEquals(new double []{0,1,1,2,3,5,8,13,21,34}, variabonacci.xbonacci(new double []{0,1},10));
        assertArrayEquals(new double []{1,1,2,3,5,8,13,21,34,55}, variabonacci.xbonacci(new double []{1,1},10));
        assertArrayEquals(new double []{0,0,0,0,1,1,2,4,8,16}, variabonacci.xbonacci(new double []{0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0,0,0,0,1,2,3,6}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},10));
        assertArrayEquals(new double []{1,0,0}, variabonacci.xbonacci(new double []{1,0,0,0,0,0,1},3));
    }

    private void assertArrayEquals(double []expecteds, double[] actuals) {
        if (expecteds == null && actuals == null)
            assertEquals(0,0);
        else {
            for (int i = 0; i < actuals.length; i++)
                assertEquals(expecteds[i], actuals[i], 1e-10);
        }
    }
}
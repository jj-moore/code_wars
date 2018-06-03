package squares_perimeter;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class SquaresPerimeterTest {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), SquaresPerimeter.perimeter(BigInteger.valueOf(5)));
    }

    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), SquaresPerimeter.perimeter(BigInteger.valueOf(7)));
    }


    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), SquaresPerimeter.perimeter(BigInteger.valueOf(30)));
    }


}
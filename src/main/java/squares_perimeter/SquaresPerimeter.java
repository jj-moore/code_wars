package squares_perimeter;

import java.math.BigInteger;
import java.util.stream.IntStream;

class SquaresPerimeter {

    static BigInteger perimeter(BigInteger n) {
        BigInteger previousNum = BigInteger.ZERO;
        BigInteger currentNum = BigInteger.ONE;

        for (int i = 0; i < n.intValue() + 2; i++) {
            currentNum = currentNum.add(previousNum);
            previousNum = currentNum.add(previousNum.negate());
        }
        return currentNum.add(BigInteger.ONE.negate()).shiftLeft(2);
    }
}

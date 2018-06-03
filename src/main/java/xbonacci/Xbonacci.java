package xbonacci;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {
        if (n < 0 || signature == null) return null;
        double[] result = Arrays.copyOf(signature, n);
        IntStream.range(signature.length, n)
                 .forEach(i -> result[i] = Arrays.stream(result, i - signature.length, i)
                                                 .sum());
        return result;
    }
}

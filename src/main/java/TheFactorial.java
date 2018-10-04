import java.math.BigInteger;

class TheFactorial {


    Integer reverseFactorial(Number number) {
        BigInteger rr = BigInteger.ZERO;
        if (number instanceof Long) {
            rr = BigInteger.valueOf((Long) number);
        } else if (number instanceof Integer) {
            rr = BigInteger.valueOf((Integer) number);
        } else if (number instanceof BigInteger) {
            rr = (BigInteger) number;
        }
        BigInteger factorial = BigInteger.ONE;
        BigInteger one = BigInteger.ONE;
        for (BigInteger i = one; rr.compareTo(i) > 0; i = i.add(one)) {
            rr = rr.divide(i);
            factorial = factorial.add(BigInteger.ONE);
        }
        return factorial.intValue();
    }
}
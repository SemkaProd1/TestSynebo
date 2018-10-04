import java.math.BigInteger;

class TheFactorial {


    Integer reverseFactorial(Number number) {

        BigInteger one = BigInteger.ONE;

        BigInteger factorial = one;

        BigInteger rr = one;

        if (number instanceof Long) {
            rr = BigInteger.valueOf((Long) number);
        }
        if (number instanceof Integer) {
            rr = BigInteger.valueOf((Integer) number);
        }
        if (number instanceof BigInteger) {
            rr = (BigInteger) number;
        }


        for (BigInteger i = one; rr.compareTo(i) > 0; i = i.add(one)) {
            rr = rr.divide(i);
            factorial = factorial.add(one);
        }
        return factorial.intValue();
    }
}
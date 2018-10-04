import java.math.BigInteger;

class TheFactorial {


    Integer reverseFactorial(Number number) {

        BigInteger one = BigInteger.ONE;

        BigInteger factorial = one;

        BigInteger bigNumber = one;

        if (number instanceof Long) {
            bigNumber = BigInteger.valueOf((Long) number);
        }
        if (number instanceof Integer) {
            bigNumber = BigInteger.valueOf((Integer) number);
        }
        if (number instanceof BigInteger) {
            bigNumber = (BigInteger) number;
        }


        for (BigInteger i = one; bigNumber.compareTo(i) > 0; i = i.add(one)) {
            bigNumber = bigNumber.divide(i);
            factorial = factorial.add(one);
        }
        return factorial.intValue();
    }
}
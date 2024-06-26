package BaseSyntx;

import java.math.BigInteger;
import java.util.Arrays;

public class IfForWhile {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        int[] val1 = new int[] {0, 2, 2};
        int[] val2 = new int[] {1,3};
        System.out.println(Arrays.toString(mergeArrays(val1, val2)));

    }

    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res; // your implementation here
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] resArr = new int[a1.length + a2.length];
        int iterA1 = 0, iterA2 = 0, iterRes = 0;

        while (iterA1 < a1.length && iterA2 < a2.length) {
            if (a1[iterA1] <= a2[iterA2]) {
                resArr[iterRes] = a1[iterA1];
                iterA1++;
            } else {
                resArr[iterRes] = a2[iterA2];
                iterA2++;
            }
            iterRes++;
        }

        while (iterA1 < a1.length) {
            resArr[iterRes] = a1[iterA1];
            iterA1++;
            iterRes++;
        }

        while (iterA2 < a2.length) {
            resArr[iterRes] = a2[iterA2];
            iterA2++;
            iterRes++;
        }

        return resArr;
    }
}

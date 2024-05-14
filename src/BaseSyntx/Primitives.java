package BaseSyntx;

public class Primitives {
    public static void main(String[] args) {

        boolean boolTest = booleanExpression(false, false, false, false);
        int yearTest = leapYearCount(1);
        boolean testMath = doubleExpression(0.1, 0.2, 0.3);
        int testBit = flipBit(13, 4);



        System.out.println(yearTest);
        System.out.println(boolTest);
        System.out.println(testMath);
        System.out.println(testBit);
    }


    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        if (a){
            count+=1;
        } else if (b) {
            count+=1;
        } else if (c) {
            count+=1;
        } else if (d) {
            count+=1;
        }
        return count == 2;

    }

    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 1e-4;
    }

    /*
    Нихера не понял надо еще раз почекать эту тему :(
     */
    public static int flipBit(int value, int bitIndex) {
        return value^(1<<(bitIndex-1));
    }

}



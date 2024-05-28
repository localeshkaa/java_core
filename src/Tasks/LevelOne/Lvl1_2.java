package Tasks.LevelOne;

public class Lvl1_2 {
    public static void main(String[] args) {

        System.out.println(fstNumber(672));

        System.out.println(lstNumber(672));

        System.out.println(sumOfNums(672));

        System.out.println(numLength(672));

        System.out.println(isEqual(51, 52));
    }

    //Дано целое число. Выведите в консоль первую цифру этого числа.
    public static int fstNumber(int number) {
        String numToStr = Integer.toString(number);
        return Character.getNumericValue(numToStr.charAt(0));
    }

    //Дано целое число. Выведите в консоль последнюю цифру этого числа.
    public static int lstNumber(int number) {
        String numToStr = Integer.toString(number);
        return Character.getNumericValue(numToStr.charAt(numToStr.length() - 1));
    }

    //Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
    public static int sumOfNums(int number) {
        String numToStr = Integer.toString(number);
        return Character.getNumericValue(numToStr.charAt(0)) + Character.getNumericValue(numToStr.charAt(numToStr.length() - 1));
    }

    //Дано целое число. Выведите количество цифр в этом числе.
    public static int numLength(int number) {
        return Integer.toString(number).length();
    }

    //Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
    public static boolean isEqual(int number1, int number2) {
        String numToStr1 = Integer.toString(number1);
        String numToStr2 = Integer.toString(number2);
        String fstNum1 = Integer.toString(Character.getNumericValue(numToStr1.charAt(0)));
        String fstNum2 = Integer.toString(Character.getNumericValue(numToStr2.charAt(0)));
        return fstNum1.equals(fstNum2);
    }
}


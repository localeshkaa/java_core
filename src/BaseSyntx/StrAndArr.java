package BaseSyntx;
import java.util.Arrays;

public class StrAndArr {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        int [] newNumbers = new int[] {1, 2, 3, 4, 5};

        boolean[] bits = new boolean[] {true, false};

        char[] digits = {
                '0', '1', '2', '3'};


        int arrayLength = numbers.length;
        int firstNumber = numbers[0];
        int lastNumber = numbers[arrayLength - 1];
        int indexOutOfBounds = numbers[5]; //error

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        boolean equals1 = a == b; // сравнение ссылок
        boolean equals2 = a.equals(b); // не работает для массивов (сравнивает ссылки)
        boolean equals3 = Arrays.equals(a, b);
//        boolean equals4 = Arrays.deepEquals(a, b); // для многомерных массивов

        System.out.println(isPalindrome("Madam, I'm Adam!"));
        String testText = "Madam, I'm Adam!";
        StringBuilder revText = new StringBuilder();
        revText.append(testText);
        revText.reverse();
        String newRevText = revText.toString();
        String testRevText = newRevText.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(testRevText);
        System.out.println(testText.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(newRevText.replaceAll("[^a-zA-Z0-9]", "")));

    }

    public static boolean isPalindrome(String text) {
        StringBuilder revTest = new StringBuilder();
        revTest.append(text).reverse();
        String revText =revTest.toString();
        return text.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(revText.replaceAll("[^a-zA-Z0-9]", ""));
    }

//    static int maxArray(int[] numbers) {...}

//    static int maxVarargs(int... numbers) {...} // для неопределенного количества аргументов


}

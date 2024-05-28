package Tasks.LevelOne;

public class Lvl1_1 {
    public static void main(String[] args) {

        positiveNum(2);

        System.out.println(lenStr("meme"));

        System.out.println(printLastChar("meme"));

        System.out.println(isEven(233));

        System.out.println(isEqual("lala", "lol"));

        System.out.println(lstChar("лесть"));
    }

    //Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
    public static void positiveNum(int value) {
        if (value > 0) {
            System.out.println("Больше 0");
        } else {
            System.out.println("Меньше 0");
        }
    }

    //Дана строка. Выведите в консоль длину этой строки.
    public static int lenStr(String newString) {
        return newString.length();
    }

    //Дана строка. Выведите в консоль последний символ строки.
    public static String printLastChar(String lstChar) {
        return lstChar.substring(lstChar.length()-1);
    }

    //Дано число. Проверьте, четное оно или нет.
    public static boolean isEven(int number) {
        return number / 2 == 0;
    }

    //Даны два слова. Проверьте, что первые буквы этих слов совпадают.
    public static boolean isEqual(String str1, String str2) {
        return str1.substring(0, 1).equals(str2.substring(0, 1));
    }

    //Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.
    public  static String lstChar(String string) {
        if (string.endsWith("ь")) {
            return string.substring(string.length() - 2, string.length() - 1);
        } else {
            return string.substring(string.length() - 1);
        }
    }


}



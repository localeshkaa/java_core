package BaseSyntx;

public class PrintfMehod {
    public static void main(String[] args) {

//        System.out.printf("%d This is a format string", 123);

        boolean myBool = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

//        System.out.printf("%b", myBool);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);

//        System.out.printf("Hello %-10s", myString);
//        System.out.printf("You have this much of money %.1f", myDouble);
        System.out.printf("You have this much of money %,f", myDouble);



    }
}

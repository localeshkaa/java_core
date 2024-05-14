package BaseSyntx;
 /*
 доделать
  */
 public class Types {
     public static void main(String[] args) {

         boolean isPower = isPowerOfTwo(8);
         char charExpress = charExpression(32);

         System.out.println(isPower);
         System.out.println(charExpress);
     }


     public static boolean isPowerOfTwo(int value) {
         return Integer.bitCount(Math.abs(value)) == 1;
     }

     public static char charExpression(int a) {
         char charValue = '\\';
         int newChar = (int)charValue + a;
         return (char)newChar;
     }
 }

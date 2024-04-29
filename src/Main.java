public class Main {
    public static void main(String[] args) {
        boolean isPower = isPowerOfTwo(8);
        System.out.println(isPower);
    }


    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
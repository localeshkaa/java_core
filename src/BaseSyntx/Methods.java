package BaseSyntx;

public class Methods {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 21;

        hello(name, age);

        int x = 3;
        int y = 4;

        int z = add(x, y);
        System.out.println(add(x, y));
        System.out.println(add(x, y, z));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + ". Your age is " + age);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }
}

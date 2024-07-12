package OOPTest.PizzaOOP;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "peperoni");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);


        Pizza pizza2 = new Pizza("thick crust", "tomato");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);

        Pizza pizza3 = new Pizza("thick crust");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza3.bread);

        Pizza pizza4 = new Pizza("thick crust");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.topping);
    }
}

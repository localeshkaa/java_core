package OOPTest.IncapsulationOOP;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolette", "Camaro", 2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2010);
        System.out.println(car.getYear());

    }
}

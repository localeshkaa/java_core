package Task;

public class Child extends Human {
    public Child(int height, double weight, int age, String voice, String name) {
        super(height, weight, age, voice, name);
    }

    private String playGames(String game) {
        return game;
    }

    private boolean goToYasli(int age) {
        return age < 1;
    }

    private boolean goToSchool(int age) {
        return age > 6 && age <= 18;
    }
}

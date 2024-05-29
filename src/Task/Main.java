package Task;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(190, 98, 25, "low", "Yarik");
        human.setHeight(180);
        System.out.println(human.getHeight());
        Child child = new Child(human.getHeight(), human.getWeight(), human.getAge(), human.getVoice(), human.getName());
        child.setWeight(33.5);
        System.out.println(child.weight);
        Woman altushka = new Woman(170, 200, 15, "Voice", "Ann");
        System.out.println(altushka.voice);

    }
}

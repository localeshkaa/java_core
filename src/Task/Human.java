package Task;

public class Human {
    //Атрибуты
    int height;
    double weight;
    int age;
    String voice;
    String name;

    //Конструктор
    public Human(int height, double weight, int age, String voice, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.voice = voice;
        this.name = name;
    }


    //Методы
    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }


}



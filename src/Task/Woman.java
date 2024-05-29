package Task;

public class Woman extends Human {
    String voice;
    public Woman(int height, double weight, int age, String voice, String name) {
        super(height, weight, age, voice, name);
        setVoice();
    }


    private void setVoice() {
        this.voice = "None";
    }
}

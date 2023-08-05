public class Toy {
    private String name;

    private float frequency;
    private static int id = 0;

    public Toy(String name, float frequency) {
        this.name = name;
        this.frequency = frequency;
        id++;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " ";
    }
}

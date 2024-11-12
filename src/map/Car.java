package map;

public class Car {
    private float engineVolume;
    private String color;
    private String model;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

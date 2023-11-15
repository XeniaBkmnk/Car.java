public class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void decelerate(int speed) {
        this.speed = speed;
    }
}

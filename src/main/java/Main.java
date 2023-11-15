public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("model 1");
        Car car2 = new Car("model 2");
        car1.setColor("green");
        car2.setColor("black");

        car1.accelerate(80);
        car2.accelerate(160);

        System.out.println("Победитель: " + getWinner(car1, car2));
        car1.decelerate(0);
        car2.decelerate(0);

    }

    public static String getWinner(Car car1, Car car2) {
        if (car1.getSpeed() > car2.getSpeed()) {
            return car1.getModel();
        } else if (car2.getSpeed() > car1.getSpeed()) {
            return car2.getModel();
        } else {

        }
        return "нечья";
    }
}

package week03;

public class Main {
    public static void main(String[] args) {
      Car[] cars = new Car[3];
      Car car1 = new Car();
      car1.changeGear('P');
      cars[0] = car1;

      Car car2 = new Car();
        car2.changeGear('N');
        cars[1] = car2;

      Car car3 = new Car();
        car3.changeGear('D');
        cars[2] = car3;

        for (Car car : cars) {
            System.out.println(car.gear);
        }
    }
}

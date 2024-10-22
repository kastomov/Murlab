public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Toyota", 2020, 25000, "Japan");
    Car car2 = new Car("Honda", 2021, 30000, "Japan");
    Car car3 = new Car("Ford", 2019, 18000, "USA");
    GroupCars group = new GroupCars(1, new Car[] {car1, car2});

    System.out.println(group);
    group.addCar(car3);
    group.sortCarsByPrice();
    System.out.println(group);
  }
}

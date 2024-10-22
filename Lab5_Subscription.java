public class Subscription {

  private String name;
  private double price;

  public Subscription(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getCost() {
    return price;
  }
}

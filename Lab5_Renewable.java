public interface Renewable {
  void renewSubscription();
}

class DailySubscription extends Subscription implements Renewable {

  public DailySubscription(String name, double price) {
    super(name, price);
  }

  @Override
  public double getCost() {
    return getPrice() * 30;
  }

  @Override
  public void renewSubscription() {
    System.out.println("Ежедневная подписка '" + getName() + "' продлена.");
  }
}

class WeeklySubscription extends Subscription implements Renewable {

  public WeeklySubscription(String name, double price) {
    super(name, price);
  }

  @Override
  public double getCost() {
    return getPrice() * 4; 
  }

  @Override
  public void renewSubscription() {
    System.out.println("Еженедельная подписка '" + getName() + "' продлена.");
  }
}

class MonthlySubscription extends Subscription {

  public MonthlySubscription(String name, double price) {
    super(name, price);
  }

  @Override
  public double getCost() {
    return getPrice();
  }
}


public class Main {
  public static void main(String[] args) {
    Subscription dailySubscription = new DailySubscription("Ежедневная газета", 1.5);
    Subscription weeklySubscription = new WeeklySubscription("Еженедельный журнал", 5);
    Subscription monthlySubscription = new MonthlySubscription("Ежемесячный журнал", 10);

    if (dailySubscription instanceof Renewable) {
      ((Renewable) dailySubscription).renewSubscription();
    }

    if (weeklySubscription instanceof Renewable) {
      ((Renewable) weeklySubscription).renewSubscription();
    }

    System.out.println(dailySubscription.getName() + ": " + dailySubscription.getCost());
    System.out.println(weeklySubscription.getName() + ": " + weeklySubscription.getCost());
    System.out.println(monthlySubscription.getName() + ": " + monthlySubscription.getCost());
  }
}

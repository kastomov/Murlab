import java.util.Arrays;
import java.time.LocalDate;
import java.util.Comparator;

public class GroupCars {
    private int groupNumber;
    private Car[] cars;

    public GroupCars() {
        this.groupNumber = 0;
        this.cars = new Car[0];
    }

    public GroupCars(int groupNumber, Car[] cars) {
        this.groupNumber = groupNumber;
        this.cars = cars;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    
    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Car getCar(int index) {
        if (index < 0 || index >= cars.length) {
            return null;
        }
        return cars[index];
    }

    public void setCar(int index, Car car) {
        if (index < 0 || index >= cars.length) {
            return;
        }
        cars[index] = car;
    }

    public void addCar(Car car) {
        Car[] newCars = Arrays.copyOf(cars, cars.length + 1);
        newCars[cars.length] = car;
        cars = newCars;
    }

    public void removeCar(String brand) {
        int index = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equals(brand)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Car[] newCars = new Car[cars.length - 1];
            System.arraycopy(cars, 0, newCars, 0, index);
            System.arraycopy(cars, index + 1, newCars, index, cars.length - index - 1);
            cars = newCars;
        }
    }

    public void sortCarsByPrice() {
        Arrays.sort(cars, Comparator.comparingDouble(Car::getPrice));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("Группа автомобилей: ").append(groupNumber).append("\n");
    for (Car car : cars) {
      sb.append(car).append("\n");
    }
    return sb.toString();
  }
}

class Car {
  private String brand;
  private int year;
  private double price;
  private String country;
  private LocalDate saleDate;
  private String buyerName;

  public Car(String brand, int year, double price, String country) {
    this.brand = brand;
    this.year = year;
    this.price = price;
    this.country = country;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LocalDate getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(LocalDate saleDate) {
    this.saleDate = saleDate;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  @Override
  public String toString() {
    return "Марка: " + brand + ", Год выпуска: " + year + ", Цена: " + price +
        ", Страна производителя: " + country + ", Дата продажи: " + saleDate +
        ", Покупатель: " + buyerName;
  }
}

import java.util.Scanner;

public class ComplexNumber {
  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public ComplexNumber log() {
    double modulus = Math.sqrt(real * real + imaginary * imaginary);
    double argument = Math.atan2(imaginary, real);
    return new ComplexNumber(Math.log(modulus), argument);
  }

  @Override
  public String toString() {
    return "(" + real + " + " + imaginary + "i)";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите действительную часть комплексного числа: ");
    double realPart = scanner.nextDouble();

    System.out.print("Введите мнимую часть комплексного числа: ");
    double imaginaryPart = scanner.nextDouble();

    ComplexNumber z = new ComplexNumber(realPart, imaginaryPart);
    ComplexNumber logZ = z.log();

    System.out.println("Комплексное число: " + z);
    System.out.println("Натуральный логарифм: " + logZ);
  }
}

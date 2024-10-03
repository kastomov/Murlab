package Murlab;

import java.util.Random;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        // Создаем массив случайных чисел
        int[] array = createRandomArray(size);
        System.out.println("Исходный массив:");
        printArray(array);

        // Создаем массив обратных дробей (вещественные числа)
        double[] reciprocalArray = createReciprocalFraction(array);
        System.out.println("\nМассив обратных дробей:");
        printArray(reciprocalArray);

        // Подсчитываем количество изменений знака
        int signChanges = countSignChanges(array);
        System.out.println("\nКоличество изменений знака: " + signChanges);
    }

    // Создает одномерный массив, заполненный случайными числами от -99 до 99
    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200) - 99; // Случайное число от -99 до 99
        }
        return array;
    }

    // Создает новый массив, где каждый элемент является обратным к исходному (вещественное число)
    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                // Используем тип double для хранения результата
                reciprocalArray[i] = (array[i] == 0) ? 0f : 1f / array[i];
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль для элемента " + array[i]);
                reciprocalArray[i] = 0.0; // Заменяем элемент на 0.0 в случае деления на 0
            }
        }
        return reciprocalArray;
    }

    // Подсчитывает количество изменений знака в массиве
    public static int countSignChanges(int[] array) {
        int signChanges = 0;
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                if (Math.signum(array[i]) != Math.signum(array[i - 1])) {
                    signChanges++;
                }
            }
        }
        return signChanges;
    }

    // Выводит массив на консоль (работает как для int, так и для double)
    public static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    // Выводит массив на консоль (работает как для int, так и для double)
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

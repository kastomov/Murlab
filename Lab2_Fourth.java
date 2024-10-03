package Murlab;

import java.util.Random;
import java.util.Scanner;

public class Fourth{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ввод размера матрицы
        System.out.print("Введите размерность матрицы (n): ");
        int n = scanner.nextInt();

        // Создание матрицы и заполнение рандомными числами
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(100) - 50; // Рандомные числа от -50 до 49
            }
        }

        // Вывод матрицы
        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Инициализация суммы положительных элементов и счетчика
        double sum = 0;
        int count = 0;

        // Проход по элементам выше параллельной главной диагонали
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i][j] > 0) {
                    sum += A[i][j];
                    count++;
                }
            }
        }

        // Вычисление среднего арифметического
        double average = count > 0 ? sum / count : 0;

        // Вывод результата
        System.out.println("Среднее арифметическое положительных элементов: " + average);
    }
}


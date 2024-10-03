package Murlab;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера матрицы
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        // Создание матрицы
        int[][] matrix = new int[rows][columns];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Вычисление среднего геометрического для каждого столбца
        for (int j = 0; j < columns; j++) {
            double product = 1;
            int count = 0;

            // Подсчет произведения положительных элементов в столбце
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > 0) {
                    product *= matrix[i][j];
                    count++;
                }
            }

            // Вычисление среднего геометрического
            double geometricMean = Math.pow(product, 1.0 / count);

            // Вывод результата
            System.out.println("Среднее геометрическое столбца " + (j + 1) + ": " + geometricMean);
        }
    }
}


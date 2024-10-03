package Murlab;

import java.util.Arrays;

public class Second {

    public static void main(String[] args) {
        // Исходный массив
        int[] x = {1, 5, 2, 8, 3, 6, 4, 9};

        // Создаем новый массив с размером, не превышающим количество элементов в x
        int[] y = new int[x.length];

        // Счетчик для заполнения массива y
        int yIndex = 0;

        // Проходим по элементам массива x
        for (int i = 0; i < x.length; i++) {
            // Если элемент больше 3, добавляем его в массив y
            if (x[i] > 3) {
                y[yIndex++] = x[i];
            }
        }

        // Сжимаем массив y, удаляя пустые элементы
        int[] yCompressed = new int[yIndex];
        for (int i = 0; i < yIndex; i++) {
            yCompressed[i] = y[i];
        }

        // Сортируем массив yCompressed методом выбора и перестановки
        sortSelection(yCompressed);

        // Выводим отсортированный массив yCompressed
        System.out.println("Отсортированный массив y: " + Arrays.toString(yCompressed));
    }

    // Метод сортировки выбором и перестановкой
    public static void sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами минимальный элемент и текущий элемент
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

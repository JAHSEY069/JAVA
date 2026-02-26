package LAB66;

import java.util.Scanner;

public class LABA6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Задание 1: Площадь прямоугольника ---
        System.out.print("Введите ширину и высоту: ");
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println("Площадь: " + rectangleArea(w, h));

        // --- Задание 2: Чётность ---
        System.out.print("Введите число для проверки на чётность: ");
        int num = scanner.nextInt();
        System.out.println("Число чётное? " + isEven(num));

        // --- Задание 3: Перегрузка метода max ---
        System.out.println("Максимум из 10 и 20 (int): " + max(10, 20));
        System.out.println("Максимум из 10.5 и 5.5 (double): " + max(10.5, 5.5));

        // --- Задание 4: Рекурсивный факториал ---
        System.out.print("Введите число для факториала: ");
        int n = scanner.nextInt();
        System.out.println("Факториал: " + factorial(n));

        // --- Задание 5: Рекурсивная степень ---
        System.out.print("Введите основание и степень: ");
        int base = scanner.nextInt();
        int exp = scanner.nextInt();
        System.out.println("Результат: " + power(base, exp));
    }

    // --- ЗАДАНИЕ 1 ---
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // --- ЗАДАНИЕ 2 ---
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // --- ЗАДАНИЕ 3 (Перегрузка) ---
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // --- ЗАДАНИЕ 4 (Рекурсия) ---
    public static long factorial(int n) {
        if (n < 0) return -1; // Ошибка
        if (n == 0 || n == 1) return 1; // Базовый случай
        return n * factorial(n - 1); // Рекурсивный шаг
    }

    // --- ЗАДАНИЕ 5 (Рекурсия) ---
    public static int power(int base, int exponent) {
        if (exponent == 0) return 1; // Любое число в степени 0 = 1
        return base * power(base, exponent - 1);
    }
}
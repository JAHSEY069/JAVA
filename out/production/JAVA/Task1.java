import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int sum = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Сумма: " + sum);
    }
}

class Task2 {
    public static void main(String[] args) {
        double x = 12;
        double y = 4;

        double sum = x + y;
        double product = x * y;
        double division = x / y;

        System.out.println("Сложение: " + sum);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + division);
    }
}

class Task3 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Начальное значение: " + number);

        number = number + 5;
        System.out.println("После присваивания: " + number);
    }
}

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        int square = num * num;
        System.out.println("Квадрат числа: " + square);
    }
}

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Площадь прямоугольника: " + area);
    }
}
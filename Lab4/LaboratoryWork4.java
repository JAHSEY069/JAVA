import java.util.Scanner;

public class LaboratoryWork4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №4");
        System.out.println("Выберите номер задания (1-10): ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Введите целое число: ");
                int num = scanner.nextInt();
                if (num > 0)
                    System.out.println("Число положительное.");
                else if (num < 0)
                    System.out.println("Число отрицательное.");
                else
                    System.out.println("Число равно нулю.");
                break;

            case 2:
                System.out.print("Введите балл (0-100): ");
                int score = scanner.nextInt();
                if (score >= 90 && score <= 100)
                    System.out.println("Оценка: 5");
                else if (score >= 75)
                    System.out.println("Оценка: 4");
                else if (score >= 60)
                    System.out.println("Оценка: 3");
                else if (score >= 0)
                    System.out.println("Оценка: 2");
                else
                    System.out.println("Некорректный ввод.");
                break;

            case 3:
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();
                if (a > b)
                    System.out.println("Первое число больше.");
                else if (a < b)
                    System.out.println("Второе число больше.");
                else
                    System.out.println("Числа равны.");
                break;

            case 4:
                System.out.print("Введите номер дня недели (1-7): ");
                int day = scanner.nextInt();
                switch (day) {
                    case 1: System.out.println("Понедельник"); break;
                    case 2: System.out.println("Вторник"); break;
                    case 3: System.out.println("Среда"); break;
                    case 4: System.out.println("Четверг"); break;
                    case 5: System.out.println("Пятница"); break;
                    case 6: System.out.println("Суббота"); break;
                    case 7: System.out.println("Воскресенье"); break;
                    default: System.out.println("Некорректный номер.");
                }
                break;

            case 5:
                System.out.print("Введите число: ");
                int number = scanner.nextInt();
                if (number % 2 == 0)
                    System.out.println("Число чётное.");
                else
                    System.out.println("Число нечётное.");
                break;

            case 6:
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                if (age >= 18)
                    System.out.println("Доступ разрешён.");
                else
                    System.out.println("Доступ запрещён.");
                break;

            case 7:
                System.out.print("Введите номер месяца (1-12): ");
                int month = scanner.nextInt();
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        System.out.println("31 день");
                        break;
                    case 4: case 6: case 9: case 11:
                        System.out.println("30 дней");
                        break;
                    case 2:
                        System.out.println("28 или 29 дней");
                        break;
                    default:
                        System.out.println("Некорректный месяц.");
                }
                break;

            case 8:
                System.out.print("Введите температуру: ");
                int temp = scanner.nextInt();
                if (temp < 10)
                    System.out.println("Холодно");
                else if (temp <= 25)
                    System.out.println("Тепло");
                else
                    System.out.println("Жарко");
                break;

            case 9:
                System.out.print("Введите число: ");
                int rangeNum = scanner.nextInt();
                if (rangeNum >= 10 && rangeNum <= 50)
                    System.out.println("Число входит в диапазон 10-50.");
                else
                    System.out.println("Число не входит в диапазон.");
                break;

            case 10:
                System.out.print("Введите первое число: ");
                double x = scanner.nextDouble();
                System.out.print("Введите операцию (+, -, *, /): ");
                char op = scanner.next().charAt(0);
                System.out.print("Введите второе число: ");
                double y = scanner.nextDouble();

                switch (op) {
                    case '+':
                        System.out.println("Результат: " + (x + y));
                        break;
                    case '-':
                        System.out.println("Результат: " + (x - y));
                        break;
                    case '*':
                        System.out.println("Результат: " + (x * y));
                        break;
                    case '/':
                        if (y != 0)
                            System.out.println("Результат: " + (x / y));
                        else
                            System.out.println("Ошибка: деление на ноль!");
                        break;
                    default:
                        System.out.println("Некорректная операция.");
                }
                break;

            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}
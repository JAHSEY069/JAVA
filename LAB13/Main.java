import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        // Общие данные
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<String> words = List.of("java", "hi", "stream", "code", "programming");

        // 1. Лямбда (сумма)
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("1: " + sum.apply(5, 3));

        // 2. Function (верхний регистр)
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("2: " + toUpper.apply("hello"));

        // 3. Predicate (нечётные)
        System.out.println("3:");
        list.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        // 4. map (квадраты)
        System.out.println("4:");
        list.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // 5. max
        System.out.print("5: ");
        list.stream()
                .max(Integer::compareTo)
                .ifPresent(System.out::println);

        // 6. Сортировка строк по длине
        System.out.println("6:");
        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        // 7. Первая буква заглавная
        System.out.println("7:");
        words.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        // 8. Длина > 5
        System.out.println("8:");
        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // 9. Method reference
        System.out.println("9:");
        list.forEach(System.out::println);

        // 10. Optional
        List<Integer> empty = new ArrayList<>();
        Optional<Integer> min = empty.stream().min(Integer::compareTo);
        System.out.println("10: " + min.orElse(-1));

        // 11. Consumer
        Consumer<String> printer = s -> System.out.println("11: " + s);
        printer.accept("Hello");

        // 12. Supplier
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("12: " + random.get());

        // Данные студентов
        List<Student> students = List.of(
                new Student("Alex", 20, 85),
                new Student("Bob", 22, 75),
                new Student("Charlie", 20, 90)
        );

        // 13. Comparator.comparing
        System.out.println("13:");
        students.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(s -> System.out.println(s.name));

        // 14. Фильтр + сортировка
        System.out.println("14:");
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));

        // 15. Цепочка
        System.out.println("15:");
        list.stream()
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // 16. grouping
        System.out.println("16:");
        Map<Integer, List<Student>> grouped =
                students.stream().collect(Collectors.groupingBy(s -> s.age));
        System.out.println(grouped);

        // 17. reduce
        int total = list.stream().reduce(0, Integer::sum);
        System.out.println("17: " + total);

        // 18. distinct + limit
        System.out.println("18:");
        List<Integer> nums = List.of(1,2,2,3,3,4,5);
        nums.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // 19. flatMap
        System.out.println("19:");
        List<List<Integer>> lists = List.of(
                List.of(1,2),
                List.of(3,4)
        );
        lists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        // 20. Real case (заказы)
        System.out.println("20:");
        List<Integer> orders = List.of(500, 2000, 1500, 300);
        orders.stream()
                .filter(o -> o > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}

// Класс Student
class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;
    }
}
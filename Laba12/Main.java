import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // 1. Длина строки
        System.out.println("1. Длина строки: " + input.length());

        // 2. Регистр
        System.out.println("2. Верхний регистр: " + input.toUpperCase());
        System.out.println("   Нижний регистр: " + input.toLowerCase());

        // 3. Подсчёт слов
        String[] words = input.trim().split("\\s+");
        System.out.println("3. Количество слов: " + words.length);

        // 4. Разворот слов
        System.out.print("4. Разворот слов: ");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
        System.out.println();

        // 5. Поиск слова
        System.out.print("5. Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        System.out.println("   Найдено: " + input.contains(searchWord));

        // 6. Замена слова
        System.out.print("6. Что заменить: ");
        String oldWord = scanner.nextLine();
        System.out.print("   На что заменить: ");
        String newWord = scanner.nextLine();
        System.out.println("   Результат: " + input.replace(oldWord, newWord));

        // 7. Палиндром
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        System.out.println("7. Палиндром: " + clean.equals(reversed));

        // 8. Сравнение строк
        System.out.print("8. Введите строку для сравнения: ");
        String compare = scanner.nextLine();
        System.out.println("   Равны: " + input.equals(compare));

        // 9. Разделение строки
        System.out.println("9. Разделение:");
        for (String w : words) {
            System.out.println("   " + w);
        }

        // 10. Гласные и согласные
        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouауоыиэяюёе".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("10. Гласные: " + vowels + ", согласные: " + consonants);

        // 11. Удалить пробелы
        System.out.println("11. Без пробелов: " + input.replace(" ", ""));

        // 12. Самое длинное слово
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("12. Самое длинное слово: " + longest);

        // 13. Символы без пробелов
        System.out.println("13. Символов без пробелов: " + input.replace(" ", "").length());

        // 14. startsWith
        System.out.print("14. Введите начало: ");
        String start = scanner.nextLine();
        System.out.println("   Начинается с: " + input.startsWith(start));

        // 15. endsWith
        System.out.print("15. Введите окончание: ");
        String end = scanner.nextLine();
        System.out.println("   Заканчивается на: " + input.endsWith(end));

        // 16. Полный разворот строки
        System.out.println("16. Разворот строки: " + new StringBuilder(input).reverse());

        // 17. Удалить цифры
        System.out.println("17. Без цифр: " + input.replaceAll("\\d", ""));

        // 18. Гласные → *
        System.out.println("18. Замена гласных: " +
                input.replaceAll("[aeiouауоыиэяюёеAEIOUАУОЫИЭЯЮЁЕ]", "*"));

        // 19. Частота символов
        System.out.println("19. Частота символов:");
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            System.out.println("   " + c + ": " + map.get(c));
        }

        // 20. Только цифры
        System.out.println("20. Только цифры: " + input.matches("\\d+"));

        scanner.close();
    }
}
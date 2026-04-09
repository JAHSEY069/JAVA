import java.util.Scanner;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Вставка
    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Поиск
    boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    // Поиск с выводом пути (фишка для защиты)
    boolean searchWithPath(Node root, int value) {
        if (root == null) {
            return false;
        }

        System.out.print(root.value + " ");

        if (root.value == value) {
            return true;
        }

        if (value < root.value) {
            return searchWithPath(root.left, value);
        } else {
            return searchWithPath(root.right, value);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        // Заполнение дерева
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        // Ввод пользователя
        System.out.print("Введите число для поиска: ");
        int value = scanner.nextInt();

        // Обычный поиск
        boolean found = tree.search(tree.root, value);

        // Вывод результата
        if (found) {
            System.out.println("Элемент найден");
        } else {
            System.out.println("Элемент не найден");
        }

        // Дополнительно: путь поиска
        System.out.print("Путь поиска: ");
        boolean foundPath = tree.searchWithPath(tree.root, value);

        if (!foundPath) {
            System.out.print(" (элемент не найден)");
        }

        scanner.close();
    }
}
package Task2;

import java.util.Scanner;

public class MainAssertStrings {
    public static void main(String[] args) {
        AssertStrings assertStrings = new AssertStrings();
        Scanner scanner = new Scanner(System.in);

        // Ввод строк пользователем
        System.out.print("Введите первую строку (a): ");
        String a = scanner.nextLine();

        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();

        assertStrings.assertStrings(a,b);

        scanner.close();
    }
}
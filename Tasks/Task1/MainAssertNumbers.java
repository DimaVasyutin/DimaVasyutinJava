package Task1;

import java.util.Scanner;

public class MainAssertNumbers {
    public static void main(String[] args) {
        AssertNumbers assertNumbers = new AssertNumbers();
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел пользователем
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        assertNumbers.assertNumbers(a, b);
        arithmeticOperation.arithmeticOperation(a, b);

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scan.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double number2 = scan.nextDouble();

        System.out.print("Введіть строку: ");
        String text = scan.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean answer = scan.nextBoolean();

        System.out.println();

        System.out.println("1. Число: " + number);
        System.out.printf("2. Число: %d%n", number);
        System.out.printf("3. Число в шістнадцятковій системі: %x%n", number);
        System.out.printf("4. Число у вісімковій системі: %o%n", number);
        System.out.printf("5. Дробове число: %.2f%n", number2);
        System.out.printf("6. Дробове число: %.3f%n", number2);
        System.out.printf("7. Строка: %s%n", text);
        System.out.printf("8. Строка: |%15s|%n", text);
        System.out.format("9. Логічне значення: %b%n", answer);
        System.out.format("10. %d %.2f %s %b%n",
                number, number2, text, answer);

        scan.close();
    }
}

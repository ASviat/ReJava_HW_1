import java.util.Scanner;

//Реализовать простой калькулятор
public class Task03 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Калькулятор инициирован.");
        CalcIt(iScanner);
        iScanner.close();
    }

    public static void CalcIt(Scanner scanIt) {

        System.out.println("Введите число 1: ");
        int num1 = scanIt.nextInt();
        System.out.println("Введите действие: ");
        char my_char = scanIt.next().charAt(0);
        System.out.println("Введите число 2: ");
        int num2 = scanIt.nextInt();

        System.out.println("Ваш результат: ");

        switch (my_char) {
            case '+':
                System.out.println(num1 + num2);
                CalcIt(scanIt);
            case '-':
                System.out.println(num1 - num2);
                CalcIt(scanIt);
            case '*':
                System.out.println(num1 * num2);
                CalcIt(scanIt);
            case '%':
                System.out.println(num1 % num2);
                CalcIt(scanIt);
            case '/':
                System.out.println(num1 / num2);
                CalcIt(scanIt);
        }
    }
}
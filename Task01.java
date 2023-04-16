import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int inputN = iScanner.nextInt();
        iScanner.close();

        System.out.printf("Сумма чисел = %d\n", SumIt(inputN));
        System.out.printf("Факториал = %d", Factorial(inputN));
    }

    public static int SumIt(int n) {
        int mySum = 0;
        for (int i = 0; i <= n; i++) {
            mySum += i;
        }
        return mySum;
    }

    public static int Factorial(int n) {
        int myProduct = 1;
        for (int i = 2; i < n + 1; i++) {
            myProduct *= i;
        }
        return myProduct;
    }
}



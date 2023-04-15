//Вывести все простые числа от 1 до 1000

public class Task02 {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            count = 0;
            for (int j = 2; j <= 43; j++) {
                if (i % j == 0 & j != i) {
                    count++;
                    if (count == 1) break;
                }
            }
            if (count == 0) System.out.print(i + " ");
        }
    }
}
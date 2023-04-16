import java.util.Scanner;

/**
 * Задано уравнение вида с, q, w, e >= 0. Некоторые цифры могут быть
 * заменены знаком вопроса, например, 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить,
 * что его нет. Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69
 * Вывод: 24 + 45 = 69
 */
public class Task04 {

    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String inputString = inputScan.nextLine();
        System.out.println(inputString);
        inputScan.close();
        

        char s = ' ';

        char[] toDetectChar = inputString.toCharArray();
        for (char c : toDetectChar) {
            if (c == '+' || c == '-' || c == '/' || c == '*') {
                s = c;
            }
           

        }
        
        var firstf = inputString.substring(0, inputString.indexOf("+")).toCharArray();
        var secondd = inputString.substring(inputString.indexOf("+") + 1, inputString.indexOf("=")).toCharArray();
        var thirdd=inputString.substring(inputString.indexOf("=")+1).toCharArray();
        for (int i = 0; i < firstf.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (firstf[i] == '?' || secondd[i] == '?') {
                    char n = Character.forDigit(j, 10);
                    firstf[i] = n;
                    secondd[i] = n;
                    
                    String first=new String(firstf);
                    int firstNumber=Integer.parseInt(first);
                    String second=new String(secondd);
                    int secondNumber=Integer.parseInt(second);
                    String third=new String(thirdd);
                    int thirdNumber=Integer.parseInt(third);
                    switch (s) {
                        case '+':
                            int mySum=firstNumber + secondNumber;
                            if(mySum!=thirdNumber)GiveNumber(firstNumber, secondNumber, thirdNumber);
                            break;
                    
                        default:
                            break;
                    }
                }

            }

        }
        System.out.println(firstf);
        System.out.println(secondd);
    }
    public static int GiveNumber(int first, int second, int third) {
        while(first+second!=third){
            
        }
    }
}




import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите арифметическое выражение : ");
        String input = scan.nextLine();


        String res = calc(input);
        System.out.print("Результат : " + res);



    }
    public static String calc (String input) {

        String[] tok = input.split(" ");

        if (tok.length != 3) {
            throw new IllegalArgumentException("Ввод должен содержать не больше трех значений !");
        }
            int a = Integer.parseInt(tok[0]);
            int b = Integer.parseInt(tok[2]);

            String acction = tok[1];

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Вводимое значение должно быть от 1 до 10 !");

            }
                int res;
                switch (acction) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
                        res = a / b;

                        break;
                    default:
                       throw new IllegalArgumentException("Не верная операция");

                } return String.valueOf(res);


        }
    }





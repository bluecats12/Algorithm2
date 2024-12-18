package Test1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int x = scanIn.nextInt();
        System.out.print("Enter your Operation (+ - * / % ^): ");
        String operator = scanIn.next();
        System.out.print("Enter your number y: ");
        int y = scanIn.nextInt();
        double z = 0;
        switch (operator) {
            case "+":
                z = x + y;
                break;

            case "-":
                z = x - y;
                break;

            case "*":
                z = x * y;
                break;

            case "/":
                z = x / y;
                break;

            case "%":
                z = x % y;
                break;


            case "^":
                z = Math.pow(x, y);
                break;

            default:
                System.out.println("You enter wrong operator");
                break;
        }

        System.out.println(z);
        scanIn.close();
    }
}
import java.util.Scanner;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.println("Welcome to My calculator");

        System.out.println("Enter Any Two Numer:-");
         Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Enter Your Choice:");
        System.out.println("For Sum press:1");
        System.out.println("For Subtract press:2");
        System.out.println("For Multiplyin press:3");
        System.out.println("For Devide press:4");
        ch = s.nextInt();

        switch (ch) {
            case 1:
                c = a + b;
                System.out.println("Sum=" + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtract=" + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication=" + c);
                break;
            case 4:
                c = a / b;
                System.out.println("Divition=" + c);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
import java.util.Scanner;

public class Relation_operator {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter Two Number:-");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
    }

}

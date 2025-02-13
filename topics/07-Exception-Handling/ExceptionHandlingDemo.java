import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        try {
            c = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        System.out.println(c);
    }
}


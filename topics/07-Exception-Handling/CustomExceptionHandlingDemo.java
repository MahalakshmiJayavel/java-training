import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
    class AgeValidator {
        void checkAge(int age)
        {
    try {
        if ((age < 0) || (age > 150))
        {
            throw new InvalidAgeException  ("Age is Invalid");
    }

    }

    catch (Exception e) {
        System.out.println(e);
    }
    }
    }

    public class CustomExceptionHandlingDemo {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();

            AgeValidator a1= new AgeValidator();
            a1.checkAge(age);

        }
    }

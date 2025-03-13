import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate currentDate= LocalDate.now();
        System.out.println("currentDate: "+ currentDate);

        LocalTime currentTime= LocalTime.now();
        System.out.println("currentTime: "+ currentTime);

        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println("currentDateTime: "+ currentDateTime);


    }

}
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FunctionalProgrammingDemo {

    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        return IntStream.range(1,n + 1)  //helps to generate numbers from 1 to n
                .map(number->number*number*number) //maps number to its cube value
                .boxed()// convert int stream to stream of intergers
                .collect(Collectors.toList());
    }
}
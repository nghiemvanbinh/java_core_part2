import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String[] languages = { "Java", "C#", "C++", "PHP", "Javascript" };
        List numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
        //-------------ex1---------------//
        Stream<Integer> stream = numbers.stream();
        //------------ex2----------------//
        Stream<Integer> stream1 = numbers.parallelStream();
        //------------ex3-----------------//
        Stream<String> testStream = Arrays.stream(languages);
        //------------ex4----------------//
        stream.filter(i->i>2).forEach(System.out::println);
        //------------ex5----------------//
        testStream.map(i->i.toUpperCase()).forEach(System.out::println);

    }
}
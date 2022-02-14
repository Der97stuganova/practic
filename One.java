import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class One {

    /*Создать коллекцию целых чисел,  написать методы:
    2.1. Который отрицательные числа делает положительными
      и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])*/
    class Int{
        String type;
        int count;

    }
    public static void main(String[] args) {
        List<Integer> collection = Arrays.asList(1,5,-3,7);
        Stream<Integer> streamFromCollection = collection.stream();
                .int x;
        filter(x -> x<0 )
                .map(Math.abs(x))
                .forEach(System.out::print);


    }
}
 
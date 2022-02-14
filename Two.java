/*
Создать коллекцию целых чисел, написать метод, который четные числа умножает на 100,
а от нечетных отнимает 100 и возвращает коллекцию.
Количество принимаемых и возвращаемых элементов коллекций должно совпадать
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Two<stringsPart2, stringsPart1> {
    List<Integer> collection = Arrays.asList(1, 2, 3, 4);
    Stream<Integer> streamFromCollection = collection.stream();
            .filter(x -> x % 10==0)
            .map (x -> x * 100)
            .forEach(System.out::print)
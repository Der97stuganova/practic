import java.util.stream.*;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Methods<arr, num> {
// Задачи на код:

//перевернуть строку
public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
        }

        //заменить символ в строке
    public abstract String replace(char oldChar, char newChar);


//удалить определенный символ в строке
public String removeFirstChar(String s){
    return s.substring(1);
}
//подсчитать сколько раз символ встречается в строке, учитывая различные раскладки
public static void searchWord(String message, String word) {
    message = message.toLowerCase();
    word = word.toLowerCase();
}

//вывести строку указанное число раз с разделителем
    public void split(String regex, int limit) {
    }

//написать метод который определяет является ли строка палиндромом
public static boolean isPalindrome(String str) {
    return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
}

    //написать метод который определяет является ли слово анаграммой (например рано - нора)
    public static void isAnagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
    }



    // вычислить число Фибоначчи


    private Object num;

    {

        int fibonacciValuesSum = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit((Long) num)
                .map(y -> y[0])
                .mapToInt(Integer::intValue)
                .sum();
    }


    // вычислить факториал
public static long factorial(int number) {
    long result = 1;

    for (int factor = 2; factor <= number; factor++) {
        result *= factor;
    }

    return result;
}
}


//Есть стринговый лист фамилий, нужно пройтись по списку,
// вытащить фамилии которые начинаются на А и поместить их в другой список для дальнейшей работы с ними

import java.util.stream.*;
import java.util.*;
import java.util.function.*;

    public class Three {

        public static void DemoStream() {
            Scanner scanner = new Scanner(System.in);
            String s;
            ArrayList<String> AL = new ArrayList<String>();

            System.out.println("Enter names: ");
            while (true) {
                System.out.print("name = ");
                s = scanner.nextLine();
                if (s.equals("")==true)
                    break;
                AL.add(s);
            }
            System.out.println();

            System.out.println("AL = " + AL);

            Predicate<String> fn;

            fn = (str) -> {
                return str.charAt(0) == 'А';
            };

            Stream<String> stream = AL.stream();

            Stream<String> resStream = stream.filter(fn);

            System.out.println("count = " + resStream.count());
        }

        public static void main(String[] args) {
            DemoStream();
        }
    }
}

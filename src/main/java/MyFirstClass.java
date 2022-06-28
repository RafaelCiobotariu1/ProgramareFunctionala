import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyFirstClass implements MyFirstInterface {
    @Override
    public int functionalInterface(int number) {
        MyFirstInterface value = n -> n * 10;


        MyFirstInterface value2 = n -> {
            int var = 10;
            return var * n;
        };

        System.out.println(value2.functionalInterface(15));
        return  10;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> true;
        Predicate<Integer> predicate1 = n -> {
            int bigNumber = n * 10;
            return  bigNumber % 7 == 0;
        };
        System.out.println(predicate1.test(7));

        Consumer<String> myConsumer;
        List<Integer> myList = List.of(2,5,6);

        myList.forEach(n -> System.out.println(n));


    }


    class MyPredicate implements Predicate<Integer>{
        @Override
        public boolean test(Integer integer) {
            int bigNumber = integer * 10;
            return  bigNumber % 7 == 0;
        }
    }
}

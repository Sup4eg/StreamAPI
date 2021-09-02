import java.util.ArrayList;
import java.util.List;

/**
 * @author Sup4eg
 */

public class TerminalMethods {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();
        collection.add("a1");
        collection.add("b1");
        collection.add("c1");
        collection.add("d1");
        collection.add("e1");
        collection.add("f1");

        //1 - findFirst
        String first = collection.stream().findFirst().orElse("1");

        //2 - findAny
        String any = collection.stream().findAny().orElse("1");

        //3 - collect
        boolean isMatch = collection.stream().anyMatch("a1"::equals);

        //4 - noneMatch
        boolean noneMatch = collection.stream().noneMatch("a8"::equals);

        //5 - min
        String min = collection.stream().min(String::compareTo).get();

        //6 - max
        String max = collection.stream().max(String::compareTo).get();

        //7 - toArray
        String[] stringsArray = collection.stream().map(String::toUpperCase).toArray(String[]::new);

        //8 - reduce
        String reduceString = collection.stream().reduce((s1, s2) -> s1 + s2).orElse("");
        System.out.println(reduceString);

        //9 - sum
        List<String> integerArray = new ArrayList<>();
        integerArray.add("1");
        integerArray.add("2");
        integerArray.add("3");

        int sum = integerArray.stream().mapToInt(Integer::parseInt).sum();
        double average = integerArray.stream().mapToInt(Integer::parseInt).average().getAsDouble();

    }

}

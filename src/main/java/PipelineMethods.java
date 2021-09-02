import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sup4eg
 */

public class PipelineMethods {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();
        collection.add("a1");
        collection.add("b1");
        collection.add("c1");
        collection.add("d1");
        collection.add("e1");
        collection.add("f1");

        //1 - filter
        long sizeA = collection.stream().filter("a1"::equals).count();

        //2 - skip
        String s = collection.stream().skip(sizeA - 1).findFirst().orElse("1");

        //3 - distinct
        List<String> distinctCollection = collection.stream().distinct().collect(Collectors.toList());

        //4 - map
        List<String> mapCollection = collection.stream().map((n) -> n + "_1").collect(Collectors.toList());

        //4 - peek
        List<String> peekCollection = collection.stream().map(String::toUpperCase).peek((e) -> System.out.println("," + e)).collect(Collectors.toList());

        //5 - limit
        List<String> limitCollection = collection.stream().limit(2).collect(Collectors.toList());

        //6 - sorted
        List<String> sortedCollection = collection.stream().sorted().collect(Collectors.toList());

        //7 - mapToInt
        int[] mapToIntCollection = collection.stream().mapToInt(k -> Integer.parseInt(k)).toArray();
     }
}

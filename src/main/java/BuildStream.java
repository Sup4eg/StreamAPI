import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sup4eg
 */

public class BuildStream {

    public static void main(String[] args) throws IOException {
        //1
        Stream<String> streamFromValues = Stream.of("a", "b", "c");

        //2
        String[] array = {"1", "2", "3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        //3
        Stream<String> streamFromLines = Files.lines(Paths.get("ex"));
//        streamFromLines.forEach(System.out::println);

        //4
        IntStream streamFromString = "123".chars();
//        streamFromString.forEach(System.out::println);

        //5
        Stream.builder().add("a1").add("a2").add("a3").build();

        //4
        List<String> collection = streamFromArrays.collect(Collectors.toList());
        Stream<String> stream = collection.parallelStream();

        //5 - infinite stream
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);

        //6
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
    }

}

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed viverra, sapien quis aliquet bibendum, ex augue laoreet nisi, ac faucibus arcu ex at mauris. Duis malesuada ante quis rhoncus consequat. Nullam tempor gravida odio, in lacinia mauris tristique in. Sed commodo, purus id venenatis ultrices, mauris ex varius nibh, nec egestas est ipsum eu velit. Fusce accumsan, lacus at euismod gravida, arcu diam egestas nisi, ac euismod lectus justo ut dolor. Suspendisse a libero vel erat sodales ultrices. Sed scelerisque ut ipsum eget bibendum. Vestibulum condimentum ut metus eu imperdiet. Donec non feugiat purus.";

        // парсим текст на слова
        String[] words = text.split("\\W+");

        // печатаем слова в порядке возрастания длины
        Arrays.stream(words)
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
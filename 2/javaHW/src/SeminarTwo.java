import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SeminarTwo {
    public void palindromeCheck(String s){
        s = s.replaceAll("[^А-яA-z0-9]", "");
        if(s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase())){
            System.out.printf("string %s is palindrome", s);
        }else System.out.printf("string %s is not palindrome", s);
    }
    public void writeToFile(String s, int n) throws IOException {

        String st = "";
        for (int i = 0; i < n; i++) {
            st += s + '\n';
        }
        Files.write(Path.of("file.txt"), st.getBytes());

    }
}

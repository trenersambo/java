import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PalindromeChecker {
    public static void main(String[] args) {
        String testString = "шалаш";
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }

        writeToFile("file.txt", "TEST", 100);
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void writeToFile(String filename, String content, int count) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int i = 0; i < count; i++) {
                writer.write(content + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
}

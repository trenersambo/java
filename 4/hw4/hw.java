import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] split = input.split("~");

            if (split.length != 2) {
                System.out.println("Invalid input");
                continue;
            }

            String command = split[0];
            String numberString = split[1];
            int number = Integer.parseInt(numberString);

            if (command.equals("print")) {
                try {
                    String text = list.get(number);
                    System.out.println(text);
                    list.remove(number);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Position " + number + " does not exist");
                }
            } else {
                String text = command;
                list.add(number, text);
            }
        }
    }
}

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class TextLinkedList {

    public static void main(String[] args) {
        LinkedList<TextNumberPair> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Введите строку в формате text~num: ");
            input = scanner.nextLine();
            String[] split = input.split("~");
            if (split.length != 2) {
                System.out.println("Некорректный формат строки");
                continue;
            }
            String text = split[0];
            int num;
            try {
                num = Integer.parseInt(split[1]);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный формат числа");
                continue;
            }

            if (text.equals("print")) {
                TextNumberPair pair = findPairByNumber(list, num);
                if (pair == null) {
                    System.out.println("Пусто");
                } else {
                    System.out.println(pair.text);
                    list.remove(pair);
                }
            } else {
                TextNumberPair pair = new TextNumberPair(text, num);
                insertPairInList(list, pair);
            }
        }
    }

    private static void insertPairInList(LinkedList<TextNumberPair> list, TextNumberPair pair) {
        ListIterator<TextNumberPair> it = list.listIterator();
        while (it.hasNext()) {
            TextNumberPair next = it.next();
            if (next.num == pair.num) {
                it.set(pair);
                return;
            }
            if (next.num > pair.num) {
                it.previous();
                it.add(pair);
                return;
            }
        }
        list.add(pair);
    }

    private static TextNumberPair findPairByNumber(LinkedList<TextNumberPair> list, int num) {
        for (TextNumberPair pair : list) {
            if (pair.num == num) {
                return pair;
            }
        }
        return null;
    }

    private static class TextNumberPair {
        public final String text;
        public final int num;

        public TextNumberPair(String text, int num) {
            this.text = text;
            this.num = num;
        }
    }
}

// решение при активной помощи знатоков. НЕ считать как дз!

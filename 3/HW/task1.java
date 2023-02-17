import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}

//����� ArrayList ��� �������� ������ �����. ����� �� ���������� ��������, ����� ��������� ��� �������� ������.
//������, �� ������� ��� � ������� ������ remove
// ������� ����� ������

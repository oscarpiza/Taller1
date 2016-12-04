
import java.util.Vector;

public class QuickSort {

    public QuickSort() {
    }

    public int[] sort(int[] numbers) {
        Vector<Integer> array = new Vector<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            array.add(numbers[i]);
        }

        array = sort(array);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = array.get(i);
        }

        return numbers;
    }

    private static Vector<Integer> sort(Vector<Integer> numbers) {
        if (numbers.size() == 1) {
            return numbers;
        } else {
            Vector<Integer> arrayMinor = new Vector<Integer>();
            Vector<Integer> arrayMajor = new Vector<Integer>();

            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) < numbers.get(0)) {
                    arrayMinor.add(numbers.get(i));
                } else {
                    arrayMajor.add(numbers.get(i));
                }
            }

            Vector<Integer> orderArray = new Vector<Integer>();

            if (arrayMinor.size() > 0) {
                orderArray.addAll(sort(arrayMinor));
            }
            orderArray.add(numbers.get(0));

            if (arrayMajor.size() > 0) {
                orderArray.addAll(sort(arrayMajor));
            }
            return orderArray;
        }
    }
}

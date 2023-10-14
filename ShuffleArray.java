import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);

        Collections.shuffle(originalList);

        System.out.print("Shuffled List: ");
        for (int value : originalList) {
            System.out.print(value + " ");
        }
    }
}
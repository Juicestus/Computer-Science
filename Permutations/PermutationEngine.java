import java.util.ArrayList;
import java.util.Arrays;

public class PermutationEngine<T> {
    private int currentRecurrence;
    private ArrayList<ArrayList<T>> permutations;

    public ArrayList<ArrayList<T>> getPermutations() {
        return permutations;
    }

    public void generate(T[] arr) {
        permutations = new ArrayList<ArrayList<T>>();
        generate(arr, 0);
    }

    private void generate(T[] arr, int index) {
        if (index >= arr.length) {
            permutations.add(new ArrayList<>(Arrays.asList(arr)));
            currentRecurrence++;
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generate(arr, index + 1);
            swap(arr, index, i);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
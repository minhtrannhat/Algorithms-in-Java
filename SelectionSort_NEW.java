import java.util.Arrays;

public class SelectionSort_NEW {
    public static void main(String[] args){
      int[] array = {5, 9, 1, 123, 56, 78, 99, 45, 67, 12, 34, 10, 8};
      selectionSort2(array, array.length);
      System.out.println(Arrays.toString(array));
    }

    private static void selectionSort2(int[] array, int n){
      int minimum; // temporary variable to store the minimum number index
        for (int i = 0; i < n - 1; ++i){
             minimum = i;

            for (int j = i + 1; j < n; ++j){
                if (array[j] < array[minimum] ) {
                    minimum = j;
                }
            }
            // swap
            int temp;
            temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
    }
}



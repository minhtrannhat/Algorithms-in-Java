import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    // method for sorting numbers
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args){
      double[] array = new double[]{1, 5, 8, 9, 109, 2345, 123, 456467, 5555, 43, 56, 94, 6, 7, 3, 2};
      System.out.println("The array, in its unsorted state is: ");
      System.out.println(Arrays.toString(array));
      selectionSort(array);
      System.out.println("The array after getting sorted by the selection sort algorithm is: ");
      System.out.println(Arrays.toString(array));
    }
}

import java.util.Arrays;

public class SelectionSort {
    // method for sorting numbers
    private static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++){ // traverse through every element of the array
            double currentMin = list[i]; // starting the with first element of the array, it will be the min
            int currentMinIndex = i; // keeping its index

            for (int j = i + 1; j < list.length; j++){ // loop through the rest of the array after the i-th element
                if (currentMin > list[j]){ // if the i-th element is larger than the j-th element
                    currentMin = list[j]; // the current minimum element is the latter ( j-th ) element
                    currentMinIndex = j; // the current minimum index is the j-th element ( i-th + 1 )
                }
            }
            // swap list[i] with list[currentMinIndex] a.k.a swap the smaller and the larger
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i]; // the latter index is swapped with the index before it
                list[i] = currentMin; //
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

import java.lang.reflect.Array;
import java.io.*;
import java.util.*;

public class RecursiveSelectionSort {
    public static void sort(double[] list){
        sort(list, 0, list.length - 1); // Sort the entire list
    }

    private static void sort(double[] list, int low, int high){

        if(low < high){
            // find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            double min = list[low];

            for(int i = low + 1; i <= high; i++){

                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;
            // sort the remaining list[low+1 .. high]
            sort(list, low + 1, high);
        }
    }

    public static void main(String[] args) {
        double[] arr = {5, 6, 1, 4, -6, 0, 8, 7, -5, -6, };

        System.out.println("The current array of integers is:");
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

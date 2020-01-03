import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args){

        int[] array = new int[1000];

        // fill the array with 1000 numbers
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println("Pls enter a number that is between 1 and 1000: ");

        // take in user input
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        System.out.println(binarySearch(array, userInput ));
    }

    public static String binarySearch(int[] array, int num){

        // initialize the variable
        int low = 0;
        int high = array.length - 1;
        int count = 1;

        while (low <= high){
            int pivot = (low + high) / 2;

            if (num < pivot){
                high = pivot - 1;
            }

            else if (pivot == num){
                return "The number " + num + " is in the array. And it took " + count + " examinations from the binary search algorithm";
            }

            else {
                low = pivot + 1;
            }

            count++;
        }

        return "Can not find " + num  ;
    }
}


public class BinarySearch
{
    public static void main(String[] args){

        // create an array
        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        // find the number 567 in that 1000 numbers
        System.out.println(binarySearch(array, 567));

    }

    public static String binarySearch(int[] array, int num){

        // initialize the variable
        int low = 0;
        int high = array.length - 1;
        int count = 0;

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


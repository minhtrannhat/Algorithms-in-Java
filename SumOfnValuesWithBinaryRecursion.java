public class SumOfnValuesWithBinaryRecursion {
    public static void main(String[] args){

        // create an array of the first 1000 number from 0 to 999
        int[] A = new int[1000];

        for(int i = 0; i < 1000; ++i){
            A[i] = i;
        }

        System.out.println("The sum of all the integer numbers from 0 to 1000 is : " + BinarySum(A, 0, A.length));

    }

    private static int BinarySum(int[] array, int i, int n){

        // calculate the sum of n elements in array starting from element i
        if (n == 1){
            return array[i];
        }

        return BinarySum(array, i, n /2) + BinarySum(array, i + (n / 2), n / 2);
    }
    
}

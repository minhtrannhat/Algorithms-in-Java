public class sumOfNValues {
    public static void main(String[] args){
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(CalcSum(array, array.length));
    }

    private static int CalcSum(int[] a , int n){
        if (n == 1){
            return a[0];
        }

        else{
            return CalcSum(a , n - 1) + a[n - 1];
        }
    }

}

import javax.sound.midi.SoundbankResource;
import java.net.Authenticator;

public class sumOfNValues {
    public static void main(String[] args){
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(CalcSum(array, array.length));
    }

    private static int CalcSum(int[] a , int n){
        // TODO calculate the first n-1 elements of the array and then add them to the last element of the array
        int theSum = 0;

        if (n == 1){
            return a[0];
        }

        else{
            return CalcSum(a , n - 1) + a[n - 1];
        }
    }

}

import java.util.Scanner;

// note on the performance of this program
//  it's time complexity is O(log(n))
//  each time we make a recursive call we halve the value of n;
//  hence, we make log n recursive calls. \
//  That is, this method runs in O(log n) time.


public class RecursivePower {
    public static void main(String[] args){
        // take in user's input
        Scanner input = new Scanner(System.in);

        System.out.print("Pls enter the base number, an integer x : ");
        int x = input.nextInt();

        System.out.print("Pls enter the exponent number, an integer n : ");
        int n = input.nextInt();

        // out
        System.out.print("The number " + x + " to the power of  " + n + " is " + Power(x, n));
    }

    private static int Power(int x, int n){

        if (n == 0){
            return 1;
        }

        // n is an odd number
        if ((n % 2) == 1 ){
            int y = Power(x, (n-1)/2);
            return x*y*y;
        }

        // n is an even number
        else{
            int y = Power(x, n/2);
            return y*y;
        }
    }
}

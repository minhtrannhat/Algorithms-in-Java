import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int k;
        System.out.println("Pls input your desired Fibonacci number element : ");
        k = userInput.nextInt();

        for(int i = 1; i <= k; ++i){
            System.out.println("The " + i + "th Fibonacci number is " + Fibbonacci(i));
        }
    }

    private static java.lang.Integer Fibbonacci(int k){

        if (k >= 0 && k <= 1){
            return k;
        }

        if (k < 0){
            System.out.println("Invalid input. Pls input a positive integer");
            return null;
        }

        else{
            return Fibbonacci(k - 1) + Fibbonacci(k - 2);
        }

    }
}

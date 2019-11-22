import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is the number ? ");

        int userInput = input.nextInt();

        System.out.println(factorial(userInput));
    }

    private static int factorial(int n){
        // base case
        if (n == 0){
            return 1;
        }
        // recursive case
        return n * factorial(n-1);
    }
}

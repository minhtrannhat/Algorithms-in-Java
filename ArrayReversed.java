import java.util.Scanner;
import java.lang.String;

public class ArrayReversed {
    public static void main(String[] args){
      // take in user input
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string to reverse pls : ");
        String userStringInput = input.nextLine();

        reverseString(userStringInput);

    }

    private static void reverseString(String charArray){
        int n = charArray.length();// n is the last index of the char array
        if (charArray.length() > 0) {
            System.out.print(charArray.charAt(n - 1 ));
            reverseString(charArray.substring(0, n - 1));
        }
    }
}

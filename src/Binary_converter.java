import java.util.Scanner;

public class Binary_converter {
    public static void main(String[] args) {
        // we can use the Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        // we make a string to take the user input
        String binaryToString = scanner.nextLine();
        // we can use the parseInt method to convert the binary Number
        System.out.println("The output is: "+Integer.parseInt(binaryToString,2));
    }
}

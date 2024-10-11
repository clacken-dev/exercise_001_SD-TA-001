
//import scanner to get input from user
import java.util.Scanner;

public class helloUser {
    public static void main(String[] args) {
        // create new scanner object
        Scanner scanner = new Scanner(System.in);

        // ask user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // greet the user by name
        System.out.printf("Hello %s%n", name);

        scanner.close();
    }
}
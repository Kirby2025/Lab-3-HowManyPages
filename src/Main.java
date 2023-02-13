import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Prompting User for Input
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
1
        // Calculating Minimum Pages to Read
        int minPages = 100 - age;

        // Printing Result
        System.out.println(age + " year olds should read at least " + minPages + " pages before giving up on a book.");
    }
}
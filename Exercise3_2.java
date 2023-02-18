import java.util.Scanner;
public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Please enter a positive number :");
            num = input.nextInt();
        } while (num <= 0);
        System.out.println("positive number: " +num);
    }    
}
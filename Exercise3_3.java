import java.util.Scanner;
public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Please enter a odd number :");
            num = input.nextInt();
        } while (num % 2 == 0);
        System.out.println("odd number: " +num);
    }    
}
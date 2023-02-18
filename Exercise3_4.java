import java.util.Scanner;
public class Exercise3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number of x :");
        int x = input.nextInt();
        System.out.println("Please enter a number of y :");
        int y = input.nextInt();
        System.out.println("Please enter a number of z :");
        int z = input.nextInt();
        int max = 1;    
        if (x>y) {
           if (x>z) {
               max = x;

           } else {
               max = z;
           } 
        }else{
            if (y > z) {
                max = y;
            } else {
                max = z;
            }
        }
        System.out.println("Maximum number is : " +max);
    }
}
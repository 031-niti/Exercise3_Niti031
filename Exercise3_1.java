import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number :");
        int x = input.nextInt();
        if (x == 0) {
            //เท่ากับศูนย์
            System.out.println("Zero");
        } else if(x % 2 ==0){
            //ถ้าหาร 2 ลงตัวจะเป็นเลขคู่
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
public class Exercise3_6 {
    public static void main(String[] args) {
        //set sum = 1
        double sum =1;
        for (int i=1 ; i <=100 ; i=i+1) {
            if (i % 2 == 0) {
                System.out.println(i+",");
                sum*=i;
            }
        }
        System.out.println("Answer : " +sum);
    }
}
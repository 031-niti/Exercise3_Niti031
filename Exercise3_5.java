public class Exercise3_5 {
    public static void main(String[] args) {
        //set answer = 0
        String answer = ""; 
        for (int i=1 ; i <=100 ; i=i+1) {
            if (i % 3 == 0) {
                // Format 
                if (answer == "") {
                    answer = answer+i;
                } else {
                    answer = answer + "," + i;
                }
            }
        }
        System.out.println("Answer : " +answer);
    }
}
import java.sql.SQLOutput;

public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for ( int i = 1; i <= 1000; i++){
            if (i % 3 == 0 || i % 5 ==0){
                num++;
            }
        }
        System.out.println("There are " + num + " multiple of 3 or 5 below 1000");
    }
}

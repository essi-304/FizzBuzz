public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num != 0){
            count++;
            if (num % 2 ==0) {
                num = num / 2;
            }
            else{
                num -= 1;
            }
        }
        System.out.println("goes through loop "+ count + " times.");
    }
}

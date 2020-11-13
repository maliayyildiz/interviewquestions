package Application;

import java.util.Random;

public class GenerateInteger {
    public static void main(String[] args) {
        Random ran = new Random();
        for (int i =1; i<6; i++){
            int a=i;
            a = ran.nextInt(50);
            System.out.println("random number"+i+ "= " +a);
        }
    }
}

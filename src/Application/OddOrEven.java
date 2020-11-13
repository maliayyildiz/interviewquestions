package Application;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scn.nextInt();
        if (num%2==0){
            System.out.println("Your number is even. (Your number was: "+num+")");
        }else
            System.out.println("Your number is odd. (Your number was: "+num+")");
        scn.close();
    }
}

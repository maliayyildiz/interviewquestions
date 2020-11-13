package Application;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c ;
        System.out.println("Enter any number 'a': ");
        a = scan.nextInt();
        System.out.println("Enter any number 'b': ");
        b = scan.nextInt();
        System.out.println("Enter any number 'c': ");
        c = scan.nextInt();

        if (a>b && a>c){
            System.out.println("Max number is " + a );
        }else if (b>a && b>c){
            System.out.println("Max number is " + b);
        }
        else{
            System.out.println("Max number is " + c);
        }
        scan.close();
    }
}

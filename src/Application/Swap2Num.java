package Application;

import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a,b;
        int sum;
        System.out.println("Enter a value for 'a' : ");
        a= scn.nextInt();
        System.out.println("Enter a value for 'b' : ");
        b= scn.nextInt();
        System.out.println("Before swap a is " + a +" and b is "+ b);
        sum = a+b;
        a=sum-a;
        b=sum-b;
        System.out.println("After swap a is "+ a +" and b is "+ b);
scn.close();
    }
}

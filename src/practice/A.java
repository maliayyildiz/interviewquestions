package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String word = scan.nextLine();

        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
       

    }
}

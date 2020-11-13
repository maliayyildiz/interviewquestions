package Application;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find sum of the numbers upto your number");
        int n = scanner.nextInt();
        int sum=0;
        for (int i = 0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        scanner.close();
    }
}

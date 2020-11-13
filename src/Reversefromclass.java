import java.util.Scanner;

public class Reversefromclass {

    public static void main(String []args){
        /* Interview Question
         * Ask user to enter a String
         * Type java code to print the String reverse on the console
         * For example; "Germany" output will be "ynamreG"
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();

        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
        scan.close();
    }

}




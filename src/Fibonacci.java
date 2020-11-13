public class Fibonacci {
    public static void main(String[] args) {
        //print first 10 fibonacci number
      // 0 1 1 2 3 5 8
        int a = 0, b = 1, c;
        for (int i = 0 ; i<=10; i++){
            System.out.println(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}

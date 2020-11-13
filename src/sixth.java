public class sixth {
    public static void main(String[] args) {
       // Write me a method which can identifies given number is even or odd
        //identify(5) -> print "Odd"    identify(6) -> print "Even"

  oddOrEven(5);// odd
  oddOrEven(6);// even
    }
    public static void oddOrEven(int num){

        if (num%2==0){
            System.out.println("Even");
        }else
            System.out.println("Odd");
    }
}

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        int c = a+b;
        b= c-b;
        a= c-a;
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);

        String str = "Hello";
        String str1 = "Welcome";
        System.out.println("before swap "+ str + " before swap "+ str1);
        String str2 = str + str1;
        str1 = str2.substring(0,str.length()-1);
        str = str2.substring(str.length());
        System.out.print("after swap "+ str);
        System.out.println(str1);
    }
}

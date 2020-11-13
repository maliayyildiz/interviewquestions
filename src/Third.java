public class Third {
    public static void main(String[] args) {
     /*   !Create a method: reverseString
        It should accept a string sentences
        And return the reverse of that string sentences.
                E.g:
        String str ="I love Java"; !Output:"Java love I”
                */

        String str ="I love Java";
        System.out.println(reverseString(str));

    }
    //return=result, return type=result type
    //A method can be "void" or have a return type(String, int, byte,char)
    static String reverseString(String str) {
        String reversed="";
        String[] arr = str.split(" ");//[I,Love,Java]

        for(int i=arr.length-1;i>=0;i--) {
            reversed+=arr[i]+" ";
        }
        return reversed;// I have to return a String because this method is not void
        //It is dynamic "reversed" - There is no any constant value
    }
}


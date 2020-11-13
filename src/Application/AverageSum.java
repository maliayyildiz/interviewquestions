package Application;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class AverageSum {
    public static void main(String[] args) {
        sumAndAverage(4, 6);
    }

    public static void sumAndAverage(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two number is " + sum);
        int avg = sum / 2;
        System.out.println("Average of two numer is " + avg);
        sum(3,7);
        avg(3,7);

    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int avg(int y, int x) {
        int avg = (x+y)/2;
        return avg;
    }

}

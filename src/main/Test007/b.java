import java.util.*;

public class b {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 4;
        int d = 5;
        int e = 6;

        //System.out.println("5+5="+5+5);
        System.out.println(true || false); //true          //短路与
        System.out.println(false || false);//false
        System.out.println(false || true);//true
        System.out.println(true || true);//true
        System.out.println("---------------------------------");
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false
        System.out.println(true && true);//true
        e -= 5;
        System.out.println(e);

    }
}
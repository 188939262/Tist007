import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
           if (i % 2 ==0){
               sum += i;
           }
        }
        System.out.println(sum);
        ArrayList<String> integers = new ArrayList<String>();
           integers.add("1");
           integers.add("5");
           integers.add("6");
           integers.add("7");
           integers.add("2");

        for (String i : integers) {
            System.out.println(i);
        }

        for (int i= 0;i<=5;i++){
            for (int j =0;j<8;j++){
                System.out.println("*");
            }
            System.out.println();
        }


    }


}

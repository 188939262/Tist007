import java.util.Random;
import java.util.Scanner;

public class ZuiDaZhiShuZu {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,7,8,9,9000};
        int arr2 = arr[0];//1
        //System.out.println(arr2);
        for (int i =0;i<arr.length;i++){
            if (arr[i]>arr2){
               arr2=arr[i];
            }
        }
        System.out.println(arr2);
        Scanner scanner = new Scanner(System.in);
        //Integer next = scanner.nextInt();
        //System.out.println(next);

        Random random = new Random();

       for (int i =0;i<3;i++){
           int i1 = random.nextInt(1232);
           System.out.println(i1);
       }

    }
}

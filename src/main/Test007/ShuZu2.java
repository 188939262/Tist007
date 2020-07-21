public class ShuZu2 {
    public static void main(String[] args) {

        int [] arr  = {1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr);
     int [] arr2 = arr;
        arr2[0] =9;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr[0]);
    }
}

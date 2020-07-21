

public class String1 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        java.lang.String s=arrayToString(arr);
        System.out.println(s);

    }
    public static java.lang.String arrayToString(int []arr){
        java.lang.String s = "[";
                for (int i = 0; i < arr.length; i++) {
                    if (i==arr.length-1){
                        s=s.concat(arr[i]+"]");
            }else {
                        s=s.concat(arr[i]+"#");
                    }
        }
                return s;
    }
}

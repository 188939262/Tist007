public class DiaoYong2 {
    public static void main(String[] args) {
        //调用compare，传递两个整数
        boolean c = compare(3,4);
        System.out.println(c);
    }

    public static boolean compare(int a,int b){
        if (a==b){
            return true;
        }else {
            return false;
        }

    }
}

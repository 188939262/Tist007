public class If {
    public static void main(String[] args) {
        int x =5;
        int y =0;
        if (x<=3){
            y = 2 *x +5; //15
        }else if (x>=1 & x>3){  //短路与    false
            y =5 *x +10;     //  35
        }else if (x<=4 || x>7){
            y= 10 *x +10;
        }
        System.out.println(y);
    }

}

public class a {

    public static void main(String[] args) {
//        System.out.println("helloworld");
//        System.out.println(123);
//        System.out.println(false);
//        System.out.println(true);
//        System.out.println(0.1278);
//        System.out.println('A');

        //自动装箱和自动拆箱
         int a =9 ;
         Integer b =Integer.valueOf(9);
        System.out.println(a == b);

         int  c =  b.intValue();
        System.out.println(c == b);

        //Integer 的取值范围是-127 -- 128
        //所以他们在进行比较的时候地址内存不一样，所以输出是false
        Integer d = 128;
        Integer e =128;
        System.out.println(d == e);

        boolean r =true;
        boolean t =true;
        System.out.println(r ==t);
    }

}

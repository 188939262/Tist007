public class Switch {
    public static void main(String[] args) {
        int a =3;
        int c =4;
        switch (a){
            case 2:
                System.out.println("数字对了");
            break;
            case  3:
                System.out.println("数字不对");
                break;
            case 1:
                System.out.println("数字对了1");

            default:
                System.out.println("穿透了哦");
        }
    }
}

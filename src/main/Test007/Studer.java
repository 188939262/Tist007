public class Studer {
    public static void main(String[] args) {
        int c =59;
        if (c<0 || c>100){
            System.out.println("你的成绩是错误的");
        }else if (c>=90 && c<=100){
            System.out.println("你的成绩属于优秀");
        }else if (c>=80 && c<=89){
            System.out.println("你的成绩属于好");
        }else if (c>=70 && c<=79){
            System.out.println("你的成绩属于良");
        }else if (c>=60 && c<=69){
            System.out.println("你的成绩属于及格");
        }else {
            System.out.println("你的成绩属于不及格");
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        compare(4,5);
    }
    //比大小
    public static int compare(int num1,int num2){
        int result = 0 ;
        if (num1==num2){
            System.out.println("num1==num2");
        }
        if (num1>num2){
            result = num1;
            System.out.println(num1+"最大");
        }else {
            result = num2;
            System.out.println(num2+"最大");
        }
        return result;
    }
}

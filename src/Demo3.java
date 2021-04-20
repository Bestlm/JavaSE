public class Demo3 {
    public static void main(String[] args) {
       max(1.0,2.0,3.0,4.0,5.0,64.89);
       max(2,3,4,9,6);
    }
    //可变参数
    public static void max(double ... i){
        if (i.length==0){
            System.out.println("1");
            return;
        }
        //排序规则
        double result=i[0];
        for (int j = 0; j < i.length; j++) {
            if (result<i[j]) {
                result = i[j];
            }
        }
        System.out.println("max num is"+" "+result);
    }
}

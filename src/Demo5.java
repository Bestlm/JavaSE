public class Demo5 {
    //数组
    public static void main(String[] args) {
        int i[] = new int[7];
        i[0]=1;
        i[1]=2;
        i[2]=3;
        i[3]=4;
        i[4]=5;
        i[5]=6;
        i[6]=7;
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            sum= sum+i[j];
        }
        System.out.println(sum);
    }
}

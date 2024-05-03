import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int count =0;
        int length =in.nextInt();
        int[]num1=new int[length];
        int[]num2=new int[length];
        int[]num3=new int[length];
        int num=2*2*2*2*2*2*2*2*2*2+1;
        int[] bukect =new int[num];
        for (int i = 0; i <length ; i++) {
            num1[i]=in.nextInt();
        }
        for (int i = 0; i <length ; i++) {
            num2[i]=in.nextInt();
        }
        for (int i = 0; i <length ; i++) {
            num3[i]=in.nextInt();
        }
        for (int i = 0; i < length; i++) {
            bukect[num1[i]+num2[i]]++;
        }
        for (int i = 0; i <length ; i++) {
           if (bukect[num3[i]]>1){
               count++;
               bukect[num3[i]]--;
           }
        }

        System.out.println(count); }
}

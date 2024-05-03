package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        //读
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int length = in.nextInt();
        int res = length;
        for (int i = 0; i < length; i++) {
            list.add(in.nextInt());
        }
        if (list.size()==1) System.out.println(list.get(0));
        //第一循环的长度
        int newLength= list.size();
        while (true) {
            //新list
            List<Integer> newList = new ArrayList<>();
            //右指针
            int right = 1;
            //遍历
            for (int left = 0; left <newLength; left++) {
                if (isPrime(list.get(left)) && isPrime(list.get(right))) {
                    newList.add(list.get(left) + list.get(right));
                    left++;
                    right+=2;
                } else {
                    newList.add(list.get(left));
                    right++;
                }

            }

            if (newList.size()==res)break;
            newLength=newList.size();
            res = newList.size();
            list=new ArrayList<>(newList);
        }
        System.out.println(res);
    }

    public static boolean isPrime(int number) {
        // 小于等于1的数不是素数
        if (number <= 1) {
            return false;
        }
        // 遍历2到sqrt(number)，如果存在number的因子，则不是素数
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // 如果没有找到任何因子，则是素数
        return true;
    }
}

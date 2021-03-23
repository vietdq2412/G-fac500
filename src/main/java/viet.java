

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class viet {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);

        List<Integer> n1 = new ArrayList<Integer>();
        List<Integer> n2 = new ArrayList<Integer>();
        List<Integer> rs = new ArrayList<Integer>();

//        System.out.println("enter n2: ");
//        String str1 = sc.nextLine();
//        for (int i = 0; i < str1.length(); i++) {
//            n2.add(str1.charAt(i) - '0');
//        }
//
//        System.out.println("enter n1: ");
//        String str2 = sc.nextLine();
//        for (int i = 0; i < str2.length(); i++) {
//            n1.add(str2.charAt(i) - '0');
//        }
//
//        rs = nhan(n1, n2);
//        giaithua();
//
//        System.out.print("\nn2: ");
//        for (int i = 0; i < n2.size(); i++) {
//            System.out.print(n2.get(i));
//        }
//        System.out.print("\nn1: ");
//        for (int i = 0; i < n1.size(); i++) {
//            System.out.print(n1.get(i));
//        }
//        System.out.print("\nrs: ");
//        for (int i = 0; i < rs.size(); i++) {
//            System.out.print(rs.get(i));
//        }
        System.out.println("nhap n: ");
        int num = sc.nextInt();
        rs = giaithua(num);
        System.out.print("\nrs: ");
        for (int i = 0; i < rs.size(); i++) {
            System.out.print(rs.get(i));
        }

    }

    ///logn
    private static List cong(List<Integer> n1, List<Integer> n2) {
        List<Integer> result = new ArrayList<>();
        int dif = n1.size() - n2.size();
        int length = n1.size();
        if (dif > 0) {
            length = n1.size();
            for (int i = 0; i < dif; i++) {
                n2.add(0, 0);
            }
        }
        else if (dif < 0) {
            length = n2.size();
            for (int i = 0; i > dif; i--) {
                n1.add(0, 0);
            }
        }

        int temp, thapphan = 0;
        for (int i = 1; i <= length; i++) {
            temp = n1.get(length - i) + n2.get(length - i) + thapphan;
            thapphan = temp / 10;
            if(i<length){
                result.add(0, temp % 10);
            }else {
                result.add(0, temp);
            }
        }

        return result;
    }

    private static List nhan(List<Integer> n1, List<Integer> n2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> subRs = new ArrayList<>();
        result.add(0);
        for (int i = n1.size(); i > 0; i--) {
            int temp, thapphan = 0;
            for (int j = n2.size(); j > 0; j--) {
                temp = n2.get(j - 1) * n1.get(i - 1) + thapphan;
                thapphan = temp / 10;
                subRs.add(0, temp % 10);
            }
            if (thapphan > 0) {
                subRs.add(0, thapphan);
            }
            for (int j = 0; j < n1.size() - i; j++) {
                subRs.add(0);
            }
            result = cong(result,subRs);
            subRs.clear();
        }
        return result;
    }

    private static List giaithua(int num) {
        List<Integer> result = new ArrayList<>();
        List<Integer> next = new ArrayList<>();

        result.add(1);
        for(int i =1; i<=num; i++) {
            next = chuyenSoThanhArray(i);
            result = nhan(next,result);
        }
        return result;
    }


    ////logn
    private static List chuyenSoThanhArray(int num) {
        List<Integer> result = new ArrayList<>();
        int rest = num;
        int lastNum;
        while(rest>=10) {
            lastNum = rest % 10;
            rest = rest/10;
            result.add(0,lastNum);
        }
        result.add(0,rest);
        return result;
    }
}

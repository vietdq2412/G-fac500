import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
    int n = 10;

        for(int i =0; i<n;i++) {
            list.add(Math.abs(random.nextInt(10)));
        }
        System.out.print("\nrs: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }



        List<Integer> listRs = new ArrayList<>();
        int[] arr = new int[20];
        for (int i = 0; i<n;i++){
           listRs.add(0);
        }

        for (int i = 0; i<list.size();i++){
            int val = listRs.get(list.get(i));
            listRs.set(list.get(i),++val);
        }

        for (int i = 0; i<list.size();i++){

            System.out.printf("\n %d xuất hiện %d lần",list.get(i),listRs.get(list.get(i)));
        }
    }
}

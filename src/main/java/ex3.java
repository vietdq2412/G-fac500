import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = 10;

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(random.nextInt(10));
        }
        System.out.print("\narr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        int [] temp = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                temp[count] = arr[i];
                count++;
            }
        }

        int [] result = new int[count];
       result = temp;

        System.out.print("\nrs: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" " + temp[i]);
        }

        System.out.print("\nresult: ");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + result[i]);
        }

    }
}

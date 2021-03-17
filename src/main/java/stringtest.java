import java.util.Scanner;

public class stringtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String nextNum = String.valueOf(num + 48);

        System.out.println(nextNum);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int end = sc.nextInt();
        if (mid >= 90) {
            if (end >= 95)
                System.out.print("100000");
            else if (end >= 90)
                System.out.print("50000");
            else
                System.out.print("0");
        }
        else
            System.out.print("0");
    }
}
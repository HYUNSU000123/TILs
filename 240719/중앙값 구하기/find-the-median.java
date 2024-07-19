import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a >= b && a >= c ? a : (b >= a && b >= c) ? b : c);
        int min = (a <= b && a <= c ? a : (b <= a && b <= c) ? b : c);
        int mid = (a <= max && a >= min ? a : (b <= max && b >= min) ? b : c);
        System.out.print(mid);
    }
}
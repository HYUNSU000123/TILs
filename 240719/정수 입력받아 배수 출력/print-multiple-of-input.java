import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= 5; i++) {
            res = n * i;
            System.out.print(res + " ");
        }
    }
}
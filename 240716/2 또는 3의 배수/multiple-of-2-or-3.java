import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.printf("1 ");
            }
            else {
                System.out.printf("0 ");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        
        if (a % 2 != 0) {
            for (i = a; i <= b; i += 2) {
                System.out.printf("%d ", i);
            }
        }
        else {
            for (i = a; i <= b; i++) {
                System.out.printf("%d ", i);
            }
        }
    }
}
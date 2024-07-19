import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int i;
        if (b % 2 != 0) {
            for (i = b; i >= a; i -= 2)
                System.out.print(i + " ");
        }
        else {
            for (i = b; i >= a; i--) 
                System.out.print(i + " ");
        }
    }
}
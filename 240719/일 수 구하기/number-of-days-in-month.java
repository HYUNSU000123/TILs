import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n != 2) || (n >= 1 && n <= 12)) {
            System.out.print("31");
        }
        else 
            System.out.print("28");
    }
}
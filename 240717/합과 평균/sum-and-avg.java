import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        double avrg = sum / 2.0;
        System.out.printf("%d %.1f", sum, avrg);
    }
}
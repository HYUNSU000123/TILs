import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMa = sc.nextInt();
        int aEn = sc.nextInt();
        int bMa = sc.nextInt();
        int bEn = sc.nextInt();
        if (aMa > bMa && aEn > bEn)
            System.out.print('1');
        else
            System.out.print('0');
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wid = sc.nextInt();
        int vrt = sc.nextInt();
        wid += 8;
        vrt *= 3;
        System.out.printf("%d\n%d\n%d", wid, vrt, wid*vrt);
    }
}
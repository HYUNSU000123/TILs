import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEngl = sc.nextInt();
        int bMath = sc.nextInt();
        int bEngl = sc.nextInt();

        if (aMath > bMath || (aMath == bMath && aEngl > bEngl))
            System.out.print("A");
        else
            System.out.print("B");
    }
}
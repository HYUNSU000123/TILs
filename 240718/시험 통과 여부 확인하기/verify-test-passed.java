import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 80) {
            System.out.print("pass");
        }
        else {
            int n = 0;
            while (score == 80) {
                n ++;
                score ++;
            }
            System.out.printf("%d more score", n);
        }

    }
}
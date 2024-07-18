import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vsnLeft = sc.nextDouble();
        double vsnRight = sc.nextDouble();

        if (vsnLeft >= 1.0 && vsnRight >= 1.0)
            System.out.print("High");
        else if (vsnLeft >= 0.5 && vsnRight >= 0.5)
            System.out.print("Middle");
        else
            System.out.print("Low");
    }
}
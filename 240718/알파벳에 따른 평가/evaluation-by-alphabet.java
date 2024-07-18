import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);
        if (alp == 'S')
            System.out.print("Superior");
        else if (alp == 'A')
            System.out.print("Exellent");
        else if (alp == 'B')
            System.out.print("Good");
        else if (alp == 'C')
            System.out.print("Usually");
        else if (alp == 'D')
            System.out.print("Effort");
        else
            System.out.print("Failure");
    }
}
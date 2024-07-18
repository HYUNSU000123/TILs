import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alp = sc.nextLine();
        if (alp.equals("S"))
            System.out.print("Superior");
        else if (alp.equals("A"))
            System.out.print("Excellent");
        else if (alp.equals("B"))
            System.out.print("Good");
        else if (alp.equals("C"))
            System.out.print("Usually");
        else if (alp.equals("D"))
            System.out.print("Effort");
        else
            System.out.print("Failure");
    }
}
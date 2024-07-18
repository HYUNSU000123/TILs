import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aTmp = sc.next();
        int aBdy = sc.nextInt();
        String bTmp = sc.next();
        int bBdy = sc.nextInt();
        String cTmp = sc.next();
        int cBdy = sc.nextInt();

        String result1 = "";
        String result2 = "";
        String result3 = "";

        if (aTmp.equals("Y") && aBdy >= 37) {
            result1 = "A";
        } else if (aTmp.equals("N") && aBdy >= 37) {
            result1 = "B";
        } else {
            result1 = "C";
        }

        if (bTmp.equals("Y") && bBdy >= 37) {
            result2 = "A";
        } else if (bTmp.equals("N") && bBdy >= 37) {
            result2 = "B";
        } else {
            result3 = "C";
        }

        if (cTmp.equals("Y") && cBdy >= 37) {
            result3 = "A";
        } else if (cTmp.equals("N") && cBdy >= 37) {
            result3 = "B";
        } else {
            result3 = "C";
        }

        int n = 0;

        if (result1.equals("A"))
            n++;
        if (result2.equals("A"))
            n++;
        if (result3.equals("A"))
            n++;

        System.out.println(n);

        if (n >= 2) {
            System.out.print("E");
        }
        else {
            System.out.print("N");
        }
    }
}
package basics_A;

import java.util.Scanner;

public class A006 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        while (num.hasNextInt()){

            int a = num.nextInt();
            int b = num.nextInt();
            int c = num.nextInt();

            double test_ans = Math.sqrt(b * b - 4 * a * c);

            if (test_ans > 0) {
                int ans_1 = (int) (-b + test_ans) / (2*a);
                int ans_2 = (int) (-b - test_ans) / (2*a);
                System.out.println("Two different roots x1=" + ans_1 + " , " + "x2=" + ans_2);
            }else if (test_ans == 0) {
                int ans_3 = (int) (-b + test_ans) / (2*a);
                System.out.println("Two same roots x=" + ans_3);
            }else {
                System.out.println("No real root");
            }
        }

        num.close();
    }
}

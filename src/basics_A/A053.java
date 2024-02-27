package basics_A;

import java.util.Scanner;

public class A053 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            int num = input.nextInt();
            int result;

            if (0 <= num && num <= 10) {
                result = num * 6;
                System.out.println(result);
            }else if (11 <= num && num <= 20) {
                result = 60 + (num - 10) * 2;
                System.out.println(result);
            } else if (21 <= num && num <= 40) {
                result = 80 + (num - 20);
                System.out.println(result);
            } else {
                System.out.println(100);
            }
        }
    }
}

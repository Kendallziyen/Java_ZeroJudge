package basics_B;

import java.util.Scanner;

public class B294 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            int day = input.nextInt();
            int sum = 0;

            for (int i = 1;i < day+1;i++) {

                int num = input.nextInt();
                sum += num * i;
            }

            System.out.println(sum);

        }

        input.close();

    }
}

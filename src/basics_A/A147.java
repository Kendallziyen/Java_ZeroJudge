package basics_A;

import java.util.Scanner;

public class A147 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            for (int i=1;i<num;i++) {

                if (i % 7 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }

            System.out.println();

            input.close();
        }
    }
}

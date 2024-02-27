package basics_A;

import java.util.Scanner;
import java.lang.Math;

public class A042 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            int num = input.nextInt();
            int circleNum = (int) (Math.pow(num, 2) - num + 2);

            System.out.println(circleNum);
        }
    }
}

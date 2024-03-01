package basics_A;

import java.util.Scanner;

public class A012 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            long hash = input.nextLong();
            long enemy = input.nextLong();


            if (hash - enemy > 0) {
                System.out.println(Math.abs(hash - enemy));
            }else {
                System.out.println(Math.abs(hash - enemy));
            }
        }
    }
}

package zeroJudge;

import java.util.Scanner;

public class A003 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        while (num.hasNextInt()){

            int month = num.nextInt();
            int day = num.nextInt();
            int S = (month * 2 + day) % 3;

            if (S == 0){
                System.out.println("普通");
            }else if (S == 1){
                System.out.println("吉");
            }else {
                System.out.println("大吉");
            }
        }
    }
}

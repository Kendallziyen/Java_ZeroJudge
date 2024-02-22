package basics_A;

import java.util.Scanner;

public class A004 {

    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);

        while (year.hasNextInt()){

            int year1 = year.nextInt();

            if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0){
                System.out.println("閏年");
            }else{
                System.out.println("平年");
            }
        }

        year.close();
    }
}

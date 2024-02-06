package basics_A;

import java.util.Scanner;

public class A005 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        while (t.hasNext()){
            int tNum = t.nextInt();

            for (int i = 0;i < tNum; i++){
                int A = t.nextInt();
                int B = t.nextInt();
                int C = t.nextInt();
                int D = t.nextInt();

                if (B - A == D - C) {
                    int d = B - A;
                    String a = "%d %d %d %d %d %n";
                    System.out.printf(a, A, B, C, D, D+d); //printf:格式化輸出
                }else if (B / A == D / C) {
                    int dd = B / A;
                    String a = "%d %d %d %d %d %n";
                    System.out.printf(a, A, B, C, D, D*dd);
                }
            }
        }
    }
}

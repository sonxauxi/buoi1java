package buoi1java.bmi;

import java.util.Scanner;

public class giapt1an {
     public static void main(String[] args) throws Exception  {
        int a , b ;
        double x ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào a :");
        a = scanner.nextInt();
        System.out.print("Nhập vào b :");
        b = scanner.nextInt();
        System.out.print("Ta có phương trình là : " + a +"x +"+ b +" = 0");

        if (a == 0 ) {
            if (b == 0) {
                System.out.println(" Phương trình có vô số nghiệm");
            }
            else {System.out.println(" Phương trình vô nghiệm");}
            
        } else {
            x = (double) -b/a;
            System.out.println( " Nghiệm của phương trình x =" + x);
            
        }
        scanner.close();
    }
}

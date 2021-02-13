package buoi1java.bmi;

import java.util.Scanner;

public class chanle { 
    public static void main(String[]args ) throws Exception{
        Scanner input = new Scanner(System.in);
        int a   ;
        a = input.nextInt ();
        /* if ( a % 2 == 0) {
            System.out.println( "a là số chẵn");            
        } else {
            System.out.println("a là số lẻ");
        } */
      String b = (  a % 2 == 0) ? " a  là số chẵn"  : " a  là số lẻ" ;
        System.out.println( b );
        input.close();
    }
    
}

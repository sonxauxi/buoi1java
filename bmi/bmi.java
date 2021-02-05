package buoi1java.bmi;
import java.util.Scanner;
public class bmi {
    public static void main(String[] args) throws Exception { 
        Scanner input = new Scanner(System.in);
        double w, h, BMI;  

        System.out.println("cân nặng");
        w = input.nextDouble();
        System.out.println("chiều cao");
        h = input.nextDouble();

        BMI = w/Math.pow(h,2 );
        System.out.println("BMI =" +BMI);
       input.close();

    }

}
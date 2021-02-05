package buoi1java.tinhlaixuat;
import java.util.Scanner;
public class tinhlaixuat {
    
    public static void main(String[] args) throws Exception { 
        Scanner input = new Scanner(System.in);
        double N, LN, LT, TLT, MM ;  

        System.out.println("Khoản nợ VND");
        N = input.nextDouble();
        System.out.println("Lãi suất Năm %");
        LN = input.nextDouble();
        LT = LN/12;
        TLT = LT/100*N;
        MM = N/12 + LN/12;
        System.out.println("Lãi suất tháng = " + LT + " % ");
        System.out.println("Tiền lãi tháng = " + TLT + " VND ");
        System.out.println("Tổng số tiền phải trả hàng tháng = " + MM + " VND ");
       
        input.close();
    }

}

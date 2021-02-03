import java.util.Scanner;
public class  demoscanner {
    
   public static void main(String[] args) throws Exception { 
    
        Scanner input = new Scanner(System.in);
        System.out.println("Tên :");
        String fullnames = input.nextLine();
        System.out.println("Tuổi :");
        String agess = input.nextLine();
        System.out.println("Quê Quán :");
        String adresss = input.nextLine();
        System.out.println("Xin chào tên tôi là " + fullnames + ", tôi năm nay "+ agess+", tôi đến từ "+ adresss);
    }
}
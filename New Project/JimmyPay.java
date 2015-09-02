import java.util.*;
public class JimmyPay{

     public static void main(String []args){
        double dpay;
        int x;
        double rate = 70.0;
        double rate2= 10.0;
        int survey;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter surveys done today:");
        survey = sc.nextInt();
        
        int setsofFive = survey / 5 ;
        int remain = survey % 5;
        
        dpay = 70* setsofFive + remain * 10.0;   
    
     System.out.print("Jimmy daily pay is: " + dpay);
    }
}

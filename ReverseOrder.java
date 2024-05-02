import java.util.*;

public class ReverseOrder {
    public static void ReverseTheNumber(int n){
        while(n>0){
        int ans = n % 10;
            n = n/10;
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
          ReverseTheNumber(n);
        
    }
    
    
}

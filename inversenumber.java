import java.util.*;

public class inversenumber{

 public static int inverseNumber(int n){
     int inv = 0;
     int op = 1;
     while(n != 0){
         int od = n % 10;
         int ip = od;
         int id = op;
         
         inv = inv + id*(int)Math.pow(10,ip-1);
         n = n/10;
         op++;
     }
     return inv;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(inverseNumber(n));
       
      }
}
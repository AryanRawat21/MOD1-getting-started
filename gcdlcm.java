import java.util.*;
    
    public class gcdlcm{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      
      int on1 = n1;
      int on2 = n2;
      
      while(n1 % n2 != 0){
          int rem = n1 %n2;
          n1 = n2;
          n2 = rem;
         
      }
      
      int gcd = n2;
      int lcm = (on1 * on2)/ gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }




// import java.util.*;

// public class gcdlcm {

//     public static void calculate_GCD_LCM(int num1, int num2) {
//         int on1 = num1;
//         int on2 = num2;
//         while (num1 % num2 != 0) {
//             int rem = num1 % num2;
//             num1 = num2;
//             num2 = rem;

//         }
//         int GCD = num2;
//         int LCM = (on1 * on2) / GCD;
//         System.out.println(GCD);
//         System.out.println(LCM);

//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int num1 = scn.nextInt();
//         int num2 = scn.nextInt();
//         calculate_GCD_LCM(num1, num2);

//     }
// }
import java.util.*;
    
    public class DigitsOfNumber{
    
    public static void main(String[] args) {
      // write your code here 
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int digits = 0;
      int temp = n;
      while(temp != 0){
          temp = temp/10;
          digits++;
      }
      
      int div = (int)Math.pow(10, digits - 1);
      
          while(div != 0){
              int q = n/div;
              System.out.println(q);
              
              n = n % div;
              div = div / 10;
          }
      }
    }



// import java.util.*;

// public class DigitsOfNumber {
//     public static Scanner scn = new Scanner(System.in);

//     public static int powerEqualDigit(int n){
//         int pow = 1;
//         n /= 10;
//         while(n != 0){
//             pow *= 10;
//             n /= 10;
//         }
//         return pow;

//     }
//     public static void digitOfANumber(int n){
//         int pow = powerEqualDigit(n);
//         while(pow != 0){
//             int quotient = n/pow;
//             n %= pow;
//             pow /= 10;
//             System.out.println(quotient);
//         }

//     }
//     public static void main(String[] args){
//         int n = scn.nextInt();
//         digitOfANumber(n);
//     }
    
// }

import java.util.*;
   
   public class RotateNumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     
     int dig = 0;
     int temp = n;
     while(temp!= 0){
         temp = temp / 10;
         dig++;
     }
     
     k = k % dig;
     if(k < 0){
         k = k + dig;
     }
     
     int mult = 1;
     int div = 1;
     
     for(int i = 1; i <= dig; i++){
         if(i <= k){
             div = div*10; 
         } else {
             mult = mult*10;
         }
     }
         
         int quo = n / div;
         int rem = n % div;
         
         int r = rem * mult + quo;
     
     System.out.println(r);
   }
   }










// import java.util.*;

// public class RotateNumber {
//     public static int countDigit(int n) {
//         int lenght = 0;
//         while (n != 0) {
//             n /= 10;
//             lenght++;
//         }
//         return lenght;
//     }

//     public static int rotateNumbers(int n, int r) {
//         int digit = countDigit(n);
//         r %= digit; // if number of rotation are greater then number
//         if (r < 0) // if number of rotation are in negative
//             r += digit;

//         int mul = 1;
//         int div = 1;
//         for (int i = 1; i <= digit; i++) {
//             if (i <= r)
//                 div *= 10;

//             else
//                 mul *= 10;

//         }
//         int a = n % div;
//         int b = n / div;
//         return ((a * mul) + b);

//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int r = scn.nextInt();
//         System.out.println(rotateNumbers(n, r));
//     }

// }

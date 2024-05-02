import java.util.*;
public class numberEvenOdd{
    public static Scanner scn = new Scanner(System.in);
    public static void printEvenOdd(int n){
        if(n % 2 == 0){
            System.out.println("even");
        }else{
            System.out.print("odd");
        }
        
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        printEvenOdd(n);
    }
    
}

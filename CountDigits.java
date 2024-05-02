import java.util.*;

public class CountDigits {
    public static int countNoOfDigits(int n){
        int length = 0;
        while( n != 0){
            n = n/10;
            length++;
        }
        return length;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       System.out.println(countNoOfDigits(n)); 

    }
}

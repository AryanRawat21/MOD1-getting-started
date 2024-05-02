import java.util.*;
public class MultipleEvenOdd{
    public static Scanner scn = new Scanner(System.in);
    public static void printOddEven(int num){
        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void printMultipleEvenOdd(){
        int count = scn.nextInt();
        for(int i = 1; i<=count;i++){
            int num = scn.nextInt();
            printOddEven(num);
        }
    }
    public static void main(String[] args){
        printMultipleEvenOdd();
    }
     
}
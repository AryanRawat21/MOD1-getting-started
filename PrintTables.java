import java.util.*;
public class PrintTables{
    public static Scanner scn = new Scanner(System.in);
    public static void printTable(int num){
        int multiply = 0;
        for(int i =1; i<=10; i++){
            multiply = num * i ;
            System.out.println(num+ "X" +i+ "="+multiply);
        }
    }
    public static void main(String[] args){
        int num = scn.nextInt();
        printTable(num);
    }

}
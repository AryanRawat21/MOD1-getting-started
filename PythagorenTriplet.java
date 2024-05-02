import java.util.*;
public class PythagorenTriplet {
    public static boolean PythagorenTriplets(int a,int b,int c){
        int max = Math.max(Math.max(a,b),c);
        if(max == a &&(b*b + c*c == a*a)) return true;
        else if(max == b &&(a*a + c*c == b*b)) return true;
        else if(max == c &&(b*b + a*a == c*c)) return true;
        else return false;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(PythagorenTriplets(a,b,c));
    }
    
}

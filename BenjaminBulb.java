import java.util.*;
import java.io.*;

public class BenjaminBulb {
    public static void main(String[] args){
        int n = scn.nextInt();
        boolean flag = true;
        int div = 2;
        while(div <= n-1){
            if(n % div == 0){
                flag = false;
            }
            div++;
        }

        if(flag == true){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}

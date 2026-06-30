import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int ip = sc.nextInt();
        int res = 0, inc = 0;
        while(ip > 0){
            if( ip%10 != 0 ) 
                res += Math.pow(2, inc);
                
            inc++;
            ip/=10;
        }
        System.out.println(res);
    }
}
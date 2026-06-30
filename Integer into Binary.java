import java.util.*;

public class Integer into Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a num: ");
        int num = sc.nextInt(); 
        String s="";
        while(num>0){
          s=num%2 + s;
          num/=2;
        } 
        System.out.println(s);
    }
}
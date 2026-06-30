import java.util.*;

public class Single{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Input = ");
      int n=sc.nextInt();
      int res;
      while(n>=10){
        res=0;
        while(n>0){
          res+=n%10;
          n/=10;
        }
        n=res;
      }
      System.out.println(n);
    }
}
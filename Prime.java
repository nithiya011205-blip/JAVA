import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Input = ");
      int n=sc.nextInt();
      int f=0;
      for(int i=2;i<=n/2;i++){
        if(n%i==0){
          f=1;
          
        }
      }
      System.out.println((f==0 && n>1)?"Prime": "NotPrime");
    }
}
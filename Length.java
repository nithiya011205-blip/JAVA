import java.util.*;
public class Length{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();

    Sum sum1=new Sum();
    sum1.Max(num);
    
    int count=0;
    int temp;
    while(num>0){
        temp=num%10;
        count+=1;
        num/=10;
    }
    System.out.println(count);
    
  }

}
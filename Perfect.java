import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a num: ");
        int num = sc.nextInt(); // 6
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0) sum+=i;
        }
        System.out.println(sum == num);
    }
}
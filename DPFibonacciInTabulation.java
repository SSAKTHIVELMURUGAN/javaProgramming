//DynamicProgramming
import java.util.Scanner;
import java.util.Arrays;
public class DPFibonacciInTabulation
{
    public static int Fibo(int[] dp,int n)
    {
          if(n <= 1){ return n; }
          dp[0] = 0;
          dp[1] = 1;
          
          for(int i =2;i<=n;i++)
          {
              dp[i] = dp[i-1] + dp[i-2];
          }
          return dp[n-1];
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	    int n = sc.nextInt();
	    int[] dp = new int[n+1];
	   // Arrays.fill(dp,-1);
	   System.out.println("THe Fibo is "+Fibo(dp,n));
	}
}

//DynamicProgramming
import java.util.Scanner;
import java.util.Arrays;
public class DPFibonacci
{
    public static int Fibo(int[] dp,int n)
    {
          if(n <= 1){ return n; }
          if(dp[n] != -1)
          {
              return dp[n];
          }
          dp[n] = Fibo(dp,n-1) + Fibo(dp,n-2);
          return dp[n];
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
	    int n = sc.nextInt();
	    int[] dp = new int[n+1];
	    Arrays.fill(dp,-1);
	   System.out.println("THe Fibo is "+Fibo(dp,n));
	}
}

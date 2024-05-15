import java.util.*;
public class Fibonacci
{
    public int fibo(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int f = fibo(n-1);  //multiple recursion
        int s = fibo(n-2);  //mulitple recursion
        return f+s;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fibonacci : ");
		int n = sc.nextInt();
		
		Fibonacci main = new Fibonacci();
		int ans = main.fibo(n);
		
		System.out.println("The Fibonacci Number is : "+ans);
	}
}

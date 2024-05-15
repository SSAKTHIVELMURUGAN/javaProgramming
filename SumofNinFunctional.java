import java.util.Scanner;
public class SumofNinFunctional
{
    public int sum(int sum1)
    {
        if(sum1==0){
            return 0;
        }
        return sum1+sum(sum1-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("ENter the sum value ");
		int n = sc.nextInt();
		SumofN main = new SumofN();
		int ans = main.sum(n);
		System.out.println("The ans is "+ans);
	}
}

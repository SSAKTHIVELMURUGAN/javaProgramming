import java.util.*;
public class factorial
{
    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	    //int f = 1;
	    factorial main = new factorial();
	   if(n >= 0)
	   {
	    System.out.println("The factorial is "+main.fact(n));   
	   }
	    else{
	        System.out.println("its -ve");
	    }
	}
}

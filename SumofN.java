import java.util.Scanner;

public class SumofN {
    public int sum(int i, int sum1) {
        if (i > 0)
        {
            System.out.println("The Number is "+sum1);
            return sum(i - 1, sum1+i);
        }
       return 0; 
    }
    
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        SumofN main = new SumofN();
        main.sum(n, 0);
    }
}

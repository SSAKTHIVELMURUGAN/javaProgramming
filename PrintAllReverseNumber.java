import java.util.Scanner;
public class PrintAllReverseNumber{
    public int ReverseNo(int n, int i)
    {
        if(i<n)
        {
            ReverseNo(n,i+1);
        }
        System.out.print(i+" ");
        return -1;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i = 0;
        PrintAllReverseNumber main = new PrintAllReverseNumber();
        main.ReverseNo(n,i);
    }
}

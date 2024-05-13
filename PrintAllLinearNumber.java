import java.util.Scanner;
public class PrintAllLinearNumber{
    
    public int LinearNo(int n, int i)
    {
        if(i <= n){
            System.out.print(i+" ");
            LinearNo(n, i+1);
        }
       
        return i;
    }
    public static void main(String[] str){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = s.nextInt();
        int i =0;
        PrintAllLinearNumber main = new PrintAllLinearNumber();
        main.LinearNo(n,i);
    }
}
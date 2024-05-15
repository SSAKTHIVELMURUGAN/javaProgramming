import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceinOne {
    public boolean SubinK(int sum, int[] arr, ArrayList<Integer> sub, int index, int arrSum, int n) {
        if (index == n) {
            if (arrSum == sum) {
                for (int i : sub) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }
        sub.add(arr[index]);
        arrSum += arr[index];
        if(SubinK(sum, arr, sub, index + 1, arrSum, n))
        {
            return true;
        }
        
        arrSum -= arr[index];
        sub.remove(sub.size() - 1);
        
        if(SubinK(sum, arr, sub, index + 1, arrSum, n))
        {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers separated by space:");
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int n = str1.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        System.out.println("Enter the sum value:");
        int sum = sc.nextInt();
        SubsequenceinOne main = new SubsequenceinOne();
        main.SubinK(sum, arr, new ArrayList<Integer>(), 0, 0, n);
    }
}

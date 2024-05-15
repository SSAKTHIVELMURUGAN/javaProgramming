import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceinK {
    public int SubinK(int sum, int[] arr, ArrayList<Integer> sub, int index, int arrSum, int n) {
        if (index == n) {
            if (arrSum == sum) {
                for (int i : sub) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return 1;
            }
            return 0;
        }
        sub.add(arr[index]);
        arrSum += arr[index];
        SubinK(sum, arr, sub, index + 1, arrSum, n);
        
        arrSum -= arr[index];
        sub.remove(sub.size() - 1);
        
        SubinK(sum, arr, sub, index + 1, arrSum, n);
        return 0;
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
        SubsequenceinK main = new SubsequenceinK();
        main.SubinK(sum, arr, new ArrayList<Integer>(), 0, 0, n);
    }
}

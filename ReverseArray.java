import java.util.Scanner;

public class ReverseArray {
    public int[] revArr(int[] arr, int f, int l) {
        if (f <= l) {
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            revArr(arr, f + 1, l - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements separated by space: ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int n = tokens.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        ReverseArray main = new ReverseArray();
        int[] reversedArray = main.revArr(arr, 0, n - 1);

        System.out.println("The reversed array is: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}

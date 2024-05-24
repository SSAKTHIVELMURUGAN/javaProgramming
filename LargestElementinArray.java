/*Given an array A[] of size n. The task is to find the largest element in it.
 

Example 1:

Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.
 

Example 2:

Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output:
5
Explanation:
The largest element of given array is 5.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function largest() which takes the array A[] and its size n as inputs and returns the maximum element in the array.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= n<= 103
0 <= A[i] <= 103
Array may contain duplicate elements. 

*/
class Compute {

    public int largest(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = arr[0];
        int a = big(arr, n, 1, max);
        return a;
    }

    public static int big(int[] arr, int n, int i, int max) {
        if (i < n) {
            if (arr[i] > max) {
                max = arr[i];
            }
            return big(arr, n, i + 1, max); // Properly return the recursive call result
        }
        return max;
    }
    
    public static void main(String[] args) {
        Compute compute = new Compute();
        int[] arr = {3, 5, 7, 2, 8, 6};
        int result = compute.largest(arr, arr.length);
        System.out.println("Largest element is: " + result); // Should output: Largest element is: 8
    }
}

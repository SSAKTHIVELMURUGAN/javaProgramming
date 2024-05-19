
import java.util.Scanner;

public class Facebook {
    public static int compare(int[] a,int[] b,int i,int j)
    {
        if(i==a.length){return j+1; }
         if (a[i] > a[j] || (a[i] == a[j] && b[i] > b[j])) {
                j = i;
            }
        return compare(a,b,i+1,j);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int ans = compare(a,b,1,0);
            System.out.println(ans);
            // your code goes here
        }
    }
}


/*Facebook
A post on facebook is said to be more popular if the number of likes on the post is strictly greater than the number of likes on some other post. In case the number of likes is same, the post having more comments is more popular.

Given arrays 
𝐴
A and 
𝐵
B, each having size 
𝑁
N, such that the number of likes and comments on the 
𝑖
𝑡
ℎ
i 
th
  post are 
𝐴
𝑖
A 
i
​
  and 
𝐵
𝑖
B 
i
​
  respectively, find out which post is most popular.

It is guaranteed that the number of comments on all the posts is distinct.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains a single integer 
𝑁
N, the number of posts.
The second line of each test case contains 
𝑁
N space-separated integers 
𝐴
1
,
𝐴
2
,
…
,
𝐴
𝑁
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
  — where 
𝐴
𝑖
A 
i
​
  is the number of likes on the 
𝑖
𝑡
ℎ
i 
th
  post.
The third line of each test case contains 
𝑁
N space-separated integers 
𝐵
1
,
𝐵
2
,
…
,
𝐵
𝑁
B 
1
​
 ,B 
2
​
 ,…,B 
N
​
  — where 
𝐵
𝑖
B 
i
​
  is the number of comments on the 
𝑖
𝑡
ℎ
i 
th
  post.
Output Format
For each test case, output on a new line, an integer in the range 
1
1 to 
𝑁
N, denoting the index of the post which is most popular among the 
𝑁
N posts.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝑁
≤
1
0
5
1≤N≤10 
5
 
1
≤
𝐴
𝑖
,
𝐵
𝑖
≤
2
⋅
1
0
5
1≤A 
i
​
 ,B 
i
​
 ≤2⋅10 
5
 
The elements of array 
𝐵
B are distinct.
It is guaranteed that the sum of 
𝑁
N over all test case does not exceed 
2
⋅
1
0
5
2⋅10 
5
 .
Sample 1:
Input
Output
4
3
5 4 4
1 2 3
3
10 10 9
2 5 4
3
3 3 9
9 1 3
4
2 8 1 5
2 8 1 9
1
2
3
2
Explanation:
Test case 
1
1: The number of likes on the first post is greater than that of second and third post. Thus, the first post is most popular.

Test case 
2
2: The first and second post have maximum number of likes. But, the second post has more comments than the first post. Thus, the second post is most popular.

Test case 
3
3: The number of likes on the third post is greater than that of first and second post. Thus, the third post is most popular.

Test case 
4
4: The number of likes on the second post is greater than that of first, third, and fourth post. Thus, the second post is most popular.

Did you like the problem?
115 users found this helpful*/

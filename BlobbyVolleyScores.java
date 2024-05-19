/*Blobby Volley Scores
Alice and Bob are playing a game of Blobby Volley. In this game, in each turn, one player is the server and the other player is the receiver. Initially, Alice is the server, and Bob is the receiver.

If the server wins the point in this turn, their score increases by 1, and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. But they become the server in the next turn.
In other words, your score increases only when you win a point when you are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.

They start with a score of 
0
0 each, and play 
𝑁
N turns. The winner of each of those hands is given to you as a string consisting of 'A's and 'B's. 'A' denoting that Alice won that point, and 'B' denoting that Bob won that point. Your job is the find the score of both of them after the 
𝑁
N turns.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains one integer 
𝑁
N — the number of turns.
The line contains a string 
𝑆
S of length 
𝑁
N.
If the 
𝑖
𝑡
ℎ
i 
th
  character of this string is 'A', then Alice won that point.
If the 
𝑖
𝑡
ℎ
i 
th
  character of this string is 'B', then Bob won that point.
Output Format
For each test case, output on a new line, two space-separated integers - Alice's final score, and Bob's final score.

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
1000
1≤N≤1000
Length of 
∣
𝑆
∣
∣S∣ = 
𝑁
N
𝑆
S consists only of the characters 'A' and 'B'.
Sample 1:
Input
Output
4
3
AAA
4
BBBB
5
ABABB
5
BABAB
3 0
0 3
1 1
0 0
Explanation:
Testcase 1: The given string is "AAA".

Score is 0, 0.
Turn 1. Alice is the server, and Bob is the receiver. Alice wins.
Score is 1, 0.
Turn 2. Alice is the server, and Bob is the receiver. Alice wins.
Score is 2, 0.
Turn 3. Alice is the server, and Bob is the receiver. Alice wins.
Score is 3, 0.
This is the final score, and so the output is 3 0.

Testcase 3: The given string is "ABABB".

Score is 0, 0.
Turn 1. Alice is the server, and Bob is the receiver. Alice wins.
Score is 1, 0.
Turn 2. Alice is the server, and Bob is the receiver. Bob wins.
Score is 1, 0. [Note that Bob's score doesn't increase]
Turn 3. Bob is the server, and Alice is the receiver. Alice wins.
Score is 1, 0. [Note that Alice's score doesn't increase]
Turn 4. Alice is the server, and Bob is the receiver. Bob wins.
Score is 1, 0. [Note that Bob's score doesn't increase]
Turn 5. Bob is the server, and Alice is the receiver. Bob wins.
Score is 1, 1.
This is the final score, and so the output is 1 1.

Testcase 4: The given string is "BABAB".

Score is 0, 0.
Turn 1. Alice is the server, and Bob is the receiver. Bob wins.
Score is 0, 0.
Turn 2. Bob is the server, and Alice is the receiver. Alice wins.
Score is 0, 0.
Turn 3. Alice is the server, and Bob is the receiver. Bob wins.
Score is 0, 0.
Turn 4. Bob is the server, and Alice is the receiver. Alice wins.
Score is 0, 0.
Turn 5. Alice is the server, and Bob is the receiver. Bob wins.
Score is 0, 0.
This is the final score, and so the output is 0 0.*/

import java.util.Scanner;

public class BlobbyVolleyScores {
    public static int[] countit(String s, int ac, int bc, int i) {
    
        if (i >= s.length()) {
            return new int[]{ac, bc};
        }
     
        if (s.charAt(i) == s.charAt(i-1)) {
            if (s.charAt(i) == 'A') {  
                ac++;
            } else if (s.charAt(i) == 'B') {  
                bc++;
            }
        }
        
        return countit(s, ac, bc, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int ac = 0;
            int bc = 0;
            if(s.charAt(0) == 'A'){ ac +=1; }
            // Call countit with initial values and starting index 1
            int[] counts = countit(s, ac, bc, 1);
            
            // Print the results
            System.out.println(counts[0]+" "+counts[1]);
        
        }
    }
}

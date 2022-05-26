/* package codechef; // don't place package name! */

/*
Problem Code: RATINGINPRAC

CodeCheffers are aware that after a contest, all problems are moved into the platform’s practice section. Based on user submissions during the contest, the system calculates and assigns a difficulty rating to each problem. Ideally, it is recommended that users practice problems in increasing order of difficulty.

Our Chef has some students in his coding class who are practicing problems. Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty. That is, the students should not solve a problem with difficulty d1, and then later a problem with difficulty d2, where d1>d2.

Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of 2 lines of input.
The first line contains a single integer N, the number of problems solved by the students
The second line contains N space-separate integers, the difficulty ratings of the problems attempted by the students in order.
Output Format
For each test case, output in a new line “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not. The output should be printed without the quotes.
Each letter of the output may be printed in either lowercase or uppercase. For example, the strings yes, YeS, and YES will all be treated as equivalent.

*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();;
		
		for(int i = 0; i < T; i++){
		    int N = scanner.nextInt();
		    int[] arr = new int[N];
		    for(int j = 0; j < N; j++){
		        arr[j] = scanner.nextInt();
		    }
		    Boolean flag = false;
		    for(int j = 0; j < N - 1; j++){
		        if(arr[j] > arr[j+1]){
		            flag = true;
		        }
		    }
		    
		    if(flag){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }
		}
	}
}

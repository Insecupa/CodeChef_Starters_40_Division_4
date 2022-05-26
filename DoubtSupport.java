/* package codechef; // don't place package name! */
/* Problem Code: DOUBTSUPPORT */

/*
On the CodeChef Practice page, problems with difficulty ≤1600 now have Doubt Support — you can go to the problem page and get your queries answered by an experienced CodeChef Doubt Solver through the "Doubt Support" tab.

Given the difficulty of a problem, output whether this problem has Doubt Support or not.

Input Format
The input consists of a single integer, D, which is the difficulty of the problem.

Output Format
Output Yes if the problem has Doubt Support, or No if it doesn't.

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
		
		int D = scanner.nextInt();
		
		if(D <= 1600){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}

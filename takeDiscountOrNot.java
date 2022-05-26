/* package codechef; // don't place package name! */

/*
Problem Code: DISCOUNTT

There are N items in a shop. You know that the price of the i-th item is Ai. Chef wants to buy all the N items.

There is also a discount coupon that costs X rupees and reduces the cost of every item by Y rupees. If the price of an item was initially ≤Y, it becomes free, i.e, costs 0.

Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of two lines of input.
The first line of the test case contains three space-separated integers — N, X, and Y.
The second line contains N space-separated integers — A1,A2,…,AN.
Output Format
For each test case, output COUPON if Chef should buy the discount coupon, and NO COUPON otherwise.
Each letter of the output may be printed in either lowercase or uppercase. For example, the strings coupon, CouPoN, and COUPON will all be treated as equivalent.
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
		
		int T = scanner.nextInt();
		
		for(int i = 0; i < T; i++){
		    int N = scanner.nextInt();
		    int X = scanner.nextInt();
		    int Y = scanner.nextInt();
		    int originalCost = 0;
		    
		    int[] arr = new int[N];
		    for(int j = 0; j < N; j++){
		        arr[j] = scanner.nextInt();
		        originalCost += arr[j];
		    }
		    
		    int sum = 0;
		    for(int j = 0; j < N; j++){
		        if(arr[j] - Y < 0){
		            arr[j] = 0;
		        }else{
		            arr[j] -= Y;
		            sum += arr[j];
		        }
		    }
		    
            int totalCost = sum + X;
            if(totalCost < originalCost){
                System.out.println("COUPON");
            }else{
                System.out.println("NO COUPON");
            }
		}
	}
}

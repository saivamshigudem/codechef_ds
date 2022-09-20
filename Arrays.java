Practice makes us perfect
Problem Code:
PRACTICEPERF
Contest Code:
MAY222

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		int a[]= new int[4];
		for(int i=0;i<4;i++){
		    a[i]= sc.nextInt();
		}
		for(int i=0;i<4;i++){
		    if(a[i]>=10){
		        count++;
		    }
		}
		System.out.println(count);
	}
}

Problems in your to-do list

Problem Code:
TODOLIST

Contest Code:
LTIME108

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a!=0){
		   int b= sc.nextInt();
		  int count=0;
		int c[]= new int[b];
		for(int i=0;i<b;i++){
		    c[i]= sc.nextInt();
		}
		for(int i=0;i<b;i++){
		    if(c[i]>=1000){
		        count++;
		    }
		}
		System.out.println(count);
		    a--;
		}
}
}

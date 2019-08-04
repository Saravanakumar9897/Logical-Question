package project2;

import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;



public class pairarr {

	
	public static void main(String args[])
	{
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0;i<n;i++)
		{
	
			
			
			arr[i]= sc.nextInt();
				
			
		}
		
		Arrays.sort(arr);
		
	//	for(int i=0;i<n;i++)
	//	{
	//		System.out.println(arr[i]);
	//	}
		
	//	for(int i=0;i<n;i=i+2)
	//	{
	//		for(int j=i+1;j<n;j=j+2) {
	//			
	//			System.out.println("i value is " +arr[i]+ " j value is " + arr[j]++ );
	//			
	//		}
	//	}
		
		int i = 0,j=i+1;
		
		while( i<n &&  j<n) {
			
			if(arr[i]==arr[j])
			{
				count = count+1;
				
				i=i+2;
				j=j+2;
				
			}
			else
			{
				i=i+1;
				j=j+1;
			}
			
			
		}
		
		System.out.println(count);
		
		
		
	//	System.out.println("End of Program");
	}
	
}


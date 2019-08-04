	import java.io.*;
	import java.lang.*;
	import java.lang.reflect.Array;
	import java.util.Scanner;
	import java.util.Arrays;



	public class Pairscount {
		
		public static void main(String args[])
		{
			int count=0;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]= sc.nextInt();
			}
			Arrays.sort(arr);
			int I=0,J=I+1;
			
			while( I<n &&  J<n) {
				
			if(arr[I]==arr[J])
				{
					count = count+1;
					I=I+2;
					J=J+2;
				}
				else
				{
					I=I+1;
					J=J+1;
				}
			}
			
			System.out.println(count);
			
		}
		
	}




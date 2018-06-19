package automationquestions;

import java.util.Arrays;
import java.util.Scanner;

public class practicequestions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		int fib;
		for (int i = 0; i < 10; i++) {
			fib = (x + y);
			x = y;
			y = fib;
			System.out.println(fib);
		}
		System.out.println();
		System.out.println("fib series using array");
	///------------------------------------------------------	
		int length=10;
		long [] fib1 = new long[length];
		fib1[0]=0;
		fib1[1]=1;
		for(int i=2;i<fib1.length;i++){
			
			fib1[i]=fib1[i-1]+fib1[i-2];
		}
		System.out.println(Arrays.toString(fib1));
		
		
	//-----------------------------------------------------	 
		
Scanner input = new Scanner (System.in);
System.out.println("Enter number:");
int t=input.nextInt();
input.close();
int u=-1;
int v=1;
int fib2;
for(int j=0;j<t;j++){
fib2=(u+v);
u=v;
v=fib2;
System.out.println(fib2);
	}
}
}
 
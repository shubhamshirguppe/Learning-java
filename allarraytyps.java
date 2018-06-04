package allarray;

import java.util.Arrays;

//import java.util.Scanner;

public class allarraytyps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] number = new int[1000];
//		
//		for (int i = 0; i < number.length; i++) {
//				number[i]=i+1;
//		}
//
//		for (int i = 0; i < number.length; i++) {
//			System.out.print(number[i]+"\t");
//			if(i%10==9)
//				System.out.println("");
//		}
//		int []number=new int[10];
//		for (int i=0; i < number.length;i++){
//			//number[i]=i+1;
//			System.out.println((i+1)*19);
//
//		}
		//for (int j=0;j<number.length;j++){
			//System.out.println(j*19);
		//}
		//System.out.println();
//		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
//		Scanner scan =  new Scanner(System.in);
//		System.out.print("Enter charcter:");
//		String input;
//		input=scan.next();
//		for(char element : arr){
//			if (input.equals(String.valueOf(element))) {
//				System.out.println(input +" found!");
//				break;
//			}
//			else{
//				System.out.println(input +" not found!");
//				break;
//			}
//			
//		}
//		scan.close();
		//String x;
//		short[] scores = { 51, 85, 32, 0, 98, 157, 82, 101, 64, 249 };
//		int fifty = 0;
//		int century = 0;
//		int doublecentury = 0;
//		int length = scores.length;
//		for (int i = 0; i < length; i++) {
//			if (scores[i] >= 50 && scores[i] < 100)
//				fifty++;
//				//System.out.println("fifty" + fifty);
//
//			else if (scores[i] >= 100 && scores[i] < 200)
//				century++;
//				//System.out.println("century" + century);
//			else if (scores[i] >= 200)
//				doublecentury++;
//				//System.out.println("Dcentury" + doublecentury);
//				
//		}
//		System.out.println("fifty:" + fifty);
//		System.out.println("century:" + century);
//		System.out.println("Dcentury:" + doublecentury);		


	    int length=9;
		long [] fibnumber = new long[length];
		//int length=fibnumber.length;
		fibnumber[0]=0;
		fibnumber[1]=1;

		for (int i=2;i< length;i++){
		fibnumber[i]=fibnumber[i-1]+fibnumber[i-2];
		//System.out.println("fibonacci:"+(fibnumber[i]+(fibnumber[i]-1)));
		}
		//System.out.print(Arrays.toString(fibnumber));
		System.out.println(Arrays.toString(fibnumber));
	}
			}



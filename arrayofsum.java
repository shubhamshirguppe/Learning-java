package arrayexample;

import java.util.Arrays;

public class arrayofsum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_1 = { 23, 1, 6, 2, 75, 9, 9, 5, 4, 8 };
		int[] array_2 = { 3, 12, 1, 2, 5, 19, 8, 7, 34, 7 };
		int add=0;
		for (int j: array_1)
			add+=j;
		System.out.println("addition is:"+add);
		//-----------------------------------------------------------------
		int []sum=add(array_1,array_2);//syntax for 2 array addition 
		System.out.println("first array: " + Arrays.toString(array_1)); 
		System.out.println("second array: " + Arrays.toString(array_2)); 
		System.out.println("sum of array: " + Arrays.toString(sum));
	
	}

	private static int[] add(int[] array_1, int[] array_2) {
		// TODO Auto-generated method stub
		int length = array_1.length < array_2.length ? array_1.length : array_2.length;

				int[] sum = new int[length];
		for (int i = 0; i < array_1.length; i++) { 
			sum[i] = array_1[i] + array_2[i]; 
			}

		return sum;
	}
}
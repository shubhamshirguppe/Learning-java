package arrayexample;

import java.util.Arrays;

public class Avgwithoutmaxmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		    int[] array_1= {5, 7, 2, 4, 9};
			System.out.println("Original Array: "+Arrays.toString(array_1)); 
			int max_val = array_1[0];
			int min = array_1[0];
			float avgsum=array_1[0];
					for(int i = 1; i < array_1.length; i++)
			{
				if(array_1[i] > max_val)
					max_val = array_1[i];
				else if(array_1[i] < min)
					min = array_1[i];
			}
			System.out.println("AVG:"+(avgsum-max_val-min/array_1.length-2));	
		 }
		}
	}



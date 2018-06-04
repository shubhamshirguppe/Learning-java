package arrayexample;

import java.util.Arrays;

public class diffarnce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 {
		    int[] array_1 = {15, 47, 22, 54, 29};
			System.out.println("Original Array: "+Arrays.toString(array_1)); 
			int max_val = array_1[0];
			int min = array_1[0];
			for(int i = 0; i < array_1.length; i++)  
				//for(int i :array_1)
				{
				if(array_1[i] > max_val)
					max_val = array_1[i];
				else if(array_1[i] < min)
					min = array_1[i];
				//i++;
		 }
			System.out.println("Difference between the largest and smallest array: "+(max_val-min));	
		 }
		}
	}


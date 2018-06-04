package arrayexample;

import java.util.Arrays;

public class evenodd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 {
		    int[] array_nums = {5, 8, 5, 4, 11};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int ctr = 0;
			for(int i = 0; i < array_nums.length; i++)
			{
				if(array_nums[i] % 2 == 0)
					ctr++;
			}
			System.out.println("Number of even numbers : "+ctr);
			System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
		 }
		}
}

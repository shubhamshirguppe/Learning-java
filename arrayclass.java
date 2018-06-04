package arrayexample;

import java.util.Arrays;

public class arrayclass {
	public static void main(String[] args) {
		// TODO Sorting of array
		int [] array_1={
				123,124,106,122,75,199,879,567,3434,897
		};
		String [] array_2={
				"Java",
	            "Python",
	            "PHP",
	            "C++",
	            "C basic",
	            "C#"
		};
		System.out.println("Array 1st is:"+Arrays.toString(array_1));
		Arrays.sort(array_1);
		System.out.println("sorted 1st array:"+Arrays.toString(array_1));
		System.out.println("Array 2nd is :"+Arrays.toString(array_2));
		Arrays.sort(array_2);
		System.out.println("Sorted 2nd array:"+Arrays.toString(array_2));

	}

}

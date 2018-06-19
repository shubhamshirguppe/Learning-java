package automationquestions;

import java.util.ArrayList;
import java.util.List;
//
import java.util.Scanner;

//
public class abcd {

	public static void main(String argss[])  
   {  
	   String original,reverse="";
	   List<String> inputs = new ArrayList();
	  // String reverse=new StringBuffer().reverse().toString();
	   Scanner scanner =new Scanner(System.in);
	   System.out.print("No of inputs to check : ");
	   int x= scanner.nextInt();
	   for (int i=x-1; i>=0;i--){
		   Scanner scan = new Scanner(System.in);
		   System.out.println("");
		   inputs.add(scan.next());
		   }
	   for(String input: inputs){
		   checkPalindrome(input);
	   }
   }

	private static void checkPalindrome(String original) {
		String str="", strWithoutSpace, reverse;
      Scanner scan = new Scanner(System.in);   
        str = scan.nextLine();
 
 
        strWithoutSpace = str.replaceAll(" ", "");
 
        System.out.println(strWithoutSpace);
		reverse = new StringBuilder(strWithoutSpace).reverse().toString();
				if (original.equalsIgnoreCase(reverse))
			System.out.println("Yes");

		else
			System.out.println("NO");
	}
}
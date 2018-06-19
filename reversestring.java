package automationquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reversestring {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
        String[] words = s.split(" ");
        String reverse = "";
       // int length = s.length();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
        }
       // for (int i = length - 1; i >= 0; i--)
           // reverse = reverse + s.charAt(i);
        System.out.print("Result:"+" "+reverse);
	}

}

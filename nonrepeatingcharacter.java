import java.util.ArrayList;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class nonrepeatingcharacter {
	static char firstnonrepeting(char str[]) {
		LinkedHashSet<Character> h = new LinkedHashSet<>();
		List<Character> list = new ArrayList<>();
		for (int i = 0; i <= str.length - 1; i++) {
			char c = str[i];
			if (list.contains(c))
			// if(!h.contains(c))
			{
				h.add(c);
				// return c;
				list.remove(list.indexOf(c));
			}
			// else if(!h.contains(c))
			else {
				list.add(c);
				// h.add(c);
			}
		}

		return list.get(0);
		// return '\0';
	}

	public static void main(String[] args) {
		String str = "GEEKSGEEKS";
		char[] arr = str.toCharArray();
		System.out.println(firstnonrepeting(arr));

	}

}

import java.util.ArrayList;
import java.util.List;

public class Contest1 {

	public static List<String> split(String str, char esc) {
		List<String> finalString = new ArrayList<String>();

		// Your Logic goes here

		String curr = "";
		for(char ch: str.toCharArray()) {
			if(ch == esc) {
				finalString.add(curr);
				curr = "";
				continue;
			}
			curr += ch;
		}

		if(!(curr.equals(""))) {
			finalString.add(curr);
		}

		return finalString;
	}

	public static void main(String[] args) {
		String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

		List<String> result = split(str, '\'');

		for (String a : result) {
			System.out.println(a);
		}
	}
}

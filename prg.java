/**
 * prg
 */
public class prg {
	public static String reverse(String str) {
		String rt="";
		for (int index = str.length()-1; index >= 0; index--) {
			rt+=str.charAt(index);
		}
		return rt;
	}

	public static void main(String[] args) {
		reverse("hello");
	}
}
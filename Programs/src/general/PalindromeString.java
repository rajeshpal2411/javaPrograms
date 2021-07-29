package general;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aba";
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			sb.append(c);
		}
		System.out.println(sb);
		if (sb.toString().equals(str)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");
	}
}

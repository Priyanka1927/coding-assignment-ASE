import java.util.Scanner;
public class Pangram {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str= scanner.nextLine();
		if(isPangram(str)) {
			System.out.println("Given input is Pangram");
		}
		else {
			System.out.println("Given input is not a Pangram");
		}
	}
	public static boolean isPangram(String str) {
		boolean[] alpha = new boolean[26];
		for(int i=str.length()-1;i>=0;i--) {
			str.toLowerCase();
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				alpha[ch - 'a'] = true;
			}
		}
		for (boolean present : alpha) {
            if (!present) {
                return false;
            }
        }
		return true;
	}

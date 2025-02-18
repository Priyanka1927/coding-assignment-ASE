import java.util.Scanner;
public class RomanToInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Roman number: ");
		String roman = scanner.nextLine().toUpperCase();
		int res = romanToInt(roman);
		System.out.println("Integer value: " + res);
		scanner.close();
	}
	public static int getValue(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	public static int romanToInt(String s) {
		int total = 0;
		int prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int current = getValue(s.charAt(i));
			if (current < prev) {
				total -= current;
			} else {
				total += current;
			}
			prev = current;
		}
		return total;
	}
}

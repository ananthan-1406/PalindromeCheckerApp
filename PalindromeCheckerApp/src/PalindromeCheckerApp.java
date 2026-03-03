import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();

    }
}

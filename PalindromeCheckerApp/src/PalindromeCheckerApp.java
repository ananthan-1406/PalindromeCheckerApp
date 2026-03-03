import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        char[] characters = input.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

// Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}

import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}

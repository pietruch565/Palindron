import java.util.Scanner;
public class Palindron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz słowo: ");
        String input = scanner.nextLine().toLowerCase();
        System.out.println("Słowo \"" + input + "\" " +
                (isPalindrome(input) ? "jest" : "nie jest") + " palindromem.");
        scanner.close();}
    public static boolean isPalindrome(String text) {
        for (int i = 0, j = text.length() - 1; i < j; i++, j--)
            if (text.charAt(i) != text.charAt(j)) return false;
        return true;}}

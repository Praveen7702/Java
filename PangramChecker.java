import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkPangram(String input) {
        Set<Character> uniqueCharacters = new HashSet<>();

        input = input.replaceAll(" ", "").toLowerCase();

        for (char c : input.toCharArray()) {
            uniqueCharacters.add(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!uniqueCharacters.contains(c)) {
                return false;
            }
        }

        return true;
    }
}

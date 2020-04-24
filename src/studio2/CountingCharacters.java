package studio2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {

        HashMap<Character, Integer> instancesOfChar = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");

        String userString = input.nextLine().toLowerCase();
        char[] charactersInString = userString.toCharArray();

        for (char character : charactersInString) {
            if (instancesOfChar.containsKey(character)) {
                instancesOfChar.put(character, instancesOfChar.get(character) + 1);
            } else {
                instancesOfChar.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> printHashMap : instancesOfChar.entrySet()) {
            System.out.println(printHashMap.getKey() + ": " + printHashMap.getValue());
        }
    }
}

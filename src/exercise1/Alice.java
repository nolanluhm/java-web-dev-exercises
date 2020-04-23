package exercise1;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        System.out.println("Search for a string within the first sentence of Alice in Wonderland:");
        String search = input.nextLine();

        boolean isFound = firstSentence.toLowerCase().contains(search.toLowerCase());
        System.out.println(isFound);

        if (isFound) {
            System.out.println("Index: " + firstSentence.toLowerCase().indexOf(search.toLowerCase()));
            System.out.println("String length: " + search.length());
            String updatedSentence = firstSentence.toLowerCase().replace(search.toLowerCase(), "");
            System.out.println(updatedSentence);
        }
    }
}

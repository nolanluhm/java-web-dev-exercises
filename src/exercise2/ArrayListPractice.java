package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> someNumbers = new ArrayList<>();

        someNumbers.add(1);
        someNumbers.add(2);
        someNumbers.add(3);
        someNumbers.add(4);
        someNumbers.add(5);
        someNumbers.add(6);
        someNumbers.add(7);
        someNumbers.add(8);
        someNumbers.add(9);
        someNumbers.add(10);

        System.out.println(sumOfEvens(someNumbers));

        ArrayList<String> someWords = new ArrayList<String>();

        someWords.add("five");
        someWords.add("slain");
        someWords.add("mother");
        someWords.add("definitely");
        someWords.add("cares");

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters do your string/strings have?");
        int searchStringLength = input.nextInt();

        System.out.println(searchByStringLength(someWords, searchStringLength));

    }
    public static int sumOfEvens(ArrayList<Integer> array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static ArrayList<String> searchByStringLength (ArrayList<String> array, int search) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();

        for (String string : array) {
            if (string.length() == search) {
                fiveLetterWords.add(string);
            }
        }
        return fiveLetterWords;
    }
}

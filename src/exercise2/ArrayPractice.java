package exercise2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        for(int number : numbers) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
        String string = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray = string.split("\\.");

        System.out.println(Arrays.toString(wordsArray));
    }
}

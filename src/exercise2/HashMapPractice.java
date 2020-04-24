package exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }
        } while(!newStudent.equals(""));
        input.close();

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println("This student's name is " + student.getKey() + " and their ID is " + student.getValue() + ".");
        }
    }
}

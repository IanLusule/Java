import java.util.Scanner;

public class studentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        int[] rollNumbers = new int[numStudents];
        String[] names = new String[numStudents];
        float[][] marks = new float[numStudents][3];
        char[] grades = new char[numStudents];
        char[] results = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter ROLL for student " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            System.out.print("Enter Name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            float sum = 0;

            System.out.print("Enter the Three Marks for student " + (i + 1) + ": ");
            String[] marksInput = scanner.nextLine().split(" ");
            if (marksInput.length != 3) {
                System.out.println("Please enter exactly three marks separated by spaces.");
                i--; // Decrement i to re-enter details for this student
                continue;
            }

            for (int j = 0; j < 3; j++) {
                marks[i][j] = Float.parseFloat(marksInput[j]);
                sum += marks[i][j];
            }

            float average = sum / 3;

            if (average >= 70 && average <= 100) {
                grades[i] = 'A';
                results[i] = 'P';
            } else if (average >= 50 && average < 70) {
                grades[i] = 'B';
                results[i] = 'P';
            } else {
                grades[i] = 'C';
                results[i] = 'F';
            }
        }

        System.out.println("*****************************************************************");
        System.out.println("\t\t\t\t\tSTUDENTS MARKLIST\t\t");
        System.out.println("*****************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(rollNumbers[i] + "\t" + names[i] + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" +
                    (marks[i][0] + marks[i][1] + marks[i][2]) + "\t" + results[i] + "\t" + (marks[i][0] + marks[i][1] + marks[i][2]) / 3 + "\t" + grades[i]);
        }

        scanner.close();
    }
}

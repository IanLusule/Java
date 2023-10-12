import java.util.Scanner;

class Student {
    int roll;
  String name;
      float mark1;
    float mark2;
    float mark3;

    Student(int roll, String name, float mark1, float mark2, float mark3) {
        this.roll = roll;
 this.name = name;
   this.mark1 = mark1;
this.mark2 = mark2;
   this.mark3 = mark3;                                                   }



    float getTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    float getAverage() {
        return getTotalMarks() / 3;
    }

        String getResult() {
        if (getTotalMarks() >= 200) {
            return "P";
        } else {
            return "F";
        }
   
                         }
}

public class studentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

    Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
  System.out.print("Enter the Student Roll Number: ");
  int rollNumber = scanner.nextInt();

  System.out.print("Enter the Student Name: ");
            String studentName = scanner.next();

  System.out.print("Enter the Three Marks: ");
  float mark1 = scanner.nextFloat();
   float mark2 = scanner.nextFloat();
 float mark3 = scanner.nextFloat();

              students[i] = new Student(rollNumber, studentName, mark1, mark2, mark3);
        }
        System.out.println("********************************************************************************************");
        System.out.println("                             STUDENT MARKLIST                                              ");
        System.out.println("********************************************************************************************");
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");

        for (Student student : students) {
            System.out.println(student.roll + "\t" + student.name + "\t" + student.mark1 + "\t" + student.mark2 + "\t" + student.mark3 + "\t" +
                    student.getTotalMarks() + "\t" + student.getResult() + "\t" + student.getAverage() + "\t" +
                    ((student.getAverage() >= 90) ? "A" : (student.getAverage() >= 80) ? "B" : (student.getAverage() >= 70) ? "C" : "D"));
        }

        scanner.close();
    }
}

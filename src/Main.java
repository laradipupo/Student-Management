//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            //        Register student with person and studentId
            Student student1 = new Student("Lara", 20, "s1234");
            student1.displayStudentDetails();
            student1.generateReport();

            //Register student with person, studentId and grade
            Student student2 = new Student("Naomi", 19, "s5678", 95);
            student2.displayStudentDetails();
            student2.generateReport();
        } catch (InvalidIdFormatException | InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            // Test invalid grade
            Student student3 = new Student("Charlie", 21, "S9101", 105);
        } catch (InvalidGradeException | InvalidIdFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
//
        try {
            // Test invalid student ID
            Student student4 = new Student("David", 24, "X1234", 85);
        } catch (InvalidGradeException | InvalidIdFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Register student with person and studentId
        Student student1 = new Student("Lara", 20, "mcb111");
        student1.displayStudentDetails();
        student1.generateReport();

        //Register student with person, studentId and grade
        Student student2 = new Student("Naomi", 19, "mcb133", 95);
        student2.displayStudentDetails();
        student2.generateReport();
    }
}
public class Student extends Person implements Report{
    private String studentId;
    private int grade;

    //    overloading 1
    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    //    Overloading 2
    public Student(String name, int age, String studentId, int grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    //    public int getGrade() {
//        return grade;
//    }
    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public void displayStudentDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Grade: " + getGrade());
    }

    @Override
    public int getGrade() {
        return 0;
    }

    @Override
    public void generateReport() {

    }
}

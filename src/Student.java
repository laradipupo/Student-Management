public class Student extends Person implements Report{
    private String studentId;
    private int grade;

    //    overloading 1
    public Student(String name, int age, String studentId) throws InvalidIdFormatException{
        super(name, age);
        if(!studentId.matches("s\\d{5}")) {
            throw new InvalidIdFormatException("Invalid student ID.");
        }
        this.studentId = studentId;
    }

    //    Overloading 2
    public Student(String name, int age, String studentId, int grade) throws InvalidGradeException, InvalidIdFormatException {
        super(name, age);
        if(!studentId.matches("s\\d{5}")) {
            throw new InvalidIdFormatException("Invalid student ID.");
        }
        if(grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100");
        }
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


        public int getGrade() {
        return grade;
    }
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

//    @Override
//    public int getGrade() {
//        return 0;
//    }

    @Override
    public void generateReport() {
//        System.out.println("Generating report for student:");
//        displayStudentDetails();
    }
}

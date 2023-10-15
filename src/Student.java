public class Student {

    private int rollno;
    private String name;
    private String grade;

    private static int studentCount=0;

    public Student(){

        setStudentCount();
    }

    public static int getStudentCount(){
        return studentCount;
    }

    public static void setStudentCount(){
        Student.studentCount++;
    }

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
        setStudentCount();
    }

    public Student(int rollno, String name, String grade){
        this.rollno = rollno;
        this.name = name;
        this.grade = grade;
        setStudentCount();
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

}

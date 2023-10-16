import java.util.Objects;

public final class Student implements Comparable<Student> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public String toString() {
        return "Student{" + "RollNumber=" + rollno + "Name: "+ name + "Grade:" + grade + '}';
    }

    public static void setStudentCount(int studentCount) {
        Student.studentCount = studentCount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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
        this.grade = null;
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

    @Override
    public int compareTo(Student o) {
        if(this.rollno == o.rollno){
            return 0;
        }else if(o.rollno<this.rollno){
            return -1;
        }else{
            return 1;
        }
    }
}

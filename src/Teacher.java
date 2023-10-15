public class Teacher {

    private int Id;
    private String name;
    private String grade;

    private static int teacherCount=0;

    public Teacher(){

        setTeacherCount();
    }

    public static int getTeacherCount(){
        return teacherCount;
    }

    public static void setTeacherCount(){
        Teacher.teacherCount++;
    }

    public Teacher(int Id, String name){
        this.Id = Id;
        this.name = name;
        this.grade = grade;
        setTeacherCount();
    }

    public Teacher(int Id, String name, String grade){
        this.Id = Id;
        this.name = name;
        this.grade = grade;
        setTeacherCount();
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }


}

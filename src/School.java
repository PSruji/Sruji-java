import java.sql.Array;

public class School {

    public static void main(String args[]){


        Student s1= new Student();
        s1.setRollno(100);
        s1.setName("Ram");
        s1.setGrade("First");
        Student s2 = new Student(101,"Radha","First") ;
        Student s3 = new Student(204,"Raj","Second") ;
        Student s4 = new Student(103,"Rekha");
        Student s5 = new Student(303,"Remya","Third");

        System.out.println(s1.getRollno()+","+s1.getName()+","+s1.getGrade());
        System.out.println(s2.getRollno()+","+s2.getName()+","+s2.getGrade());
        System.out.println(s3.getRollno()+","+s3.getName()+","+s3.getGrade());
        System.out.println(s4.getRollno()+","+s4.getName()+","+s4.getGrade());
        System.out.println(s5.getRollno()+","+s5.getName()+","+s5.getGrade());
        System.out.println(Student.getStudentCount());

        Teacher t1= new Teacher();
        t1.setId(1);
        t1.setName("Raj");
        t1.setGrade("First");
        Teacher t2 = new Teacher(2,"Tom","First") ;
        Teacher t3 = new Teacher(3,"Sally","Second") ;
        Teacher t4 = new Teacher(4,"Tim") ;
        System.out.println(t1.getId()+","+t1.getName()+","+t1.getGrade());
        System.out.println(t2.getId()+","+t2.getName()+","+t2.getGrade());
        System.out.println(t3.getId()+","+t3.getName()+","+t3.getGrade());
        System.out.println(t4.getId()+","+t4.getName()+","+t4.getGrade());
        System.out.println(Teacher.getTeacherCount());

        // Wrapper Classes/Immutable Demo

        Integer i1 = new Integer(10);
        Integer i2 = new Integer(15);
        System.out.println(i1.equals(i2));

        Student s10 = new Student(203,"Rem","Second");
        Student s11 = new Student(204,"Rem","Second");
        System.out.println(s10.equals(s11));
        System.out.println(s10);




    }

}

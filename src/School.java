import java.sql.Array;
import java.util.Map;
import java.util.*;

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

       // Teacher t1= new Teacher();
        // t1.setId(1);
        //t1.setName("Raj");
        //t1.setGrade("First");
        //Teacher t2 = new Teacher(2,"Tom","First") ;
        //Teacher t3 = new Teacher(3,"Sally","Second") ;
        //Teacher t4 = new Teacher(4,"Tim") ;
        //System.out.println(t1.getId()+","+t1.getName()+","+t1.getGrade());
        //System.out.println(t2.getId()+","+t2.getName()+","+t2.getGrade());
        //System.out.println(t3.getId()+","+t3.getName()+","+t3.getGrade());
        //System.out.println(t4.getId()+","+t4.getName()+","+t4.getGrade());
        //System.out.println(Teacher.getTeacherCount());//

        Student s10 = new Student(203,"Rem","Second");
        Student s11 = new Student(204,"Rem","Second");
        System.out.println(s10.equals(s11));
        System.out.println(s10);

        //Map< String, String> m= new HashMap<>();

        // Please find the Assignment as below:

        List<Student> list1= new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);

        int size = list1.size();
        System.out.println("List Size " + size);


        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));
        System.out.println(list1.get(4));


        //Student s15 = new Student(105, "Sateesh","First");
        //list1.add(s15);

        //System.out.println(list1.get(5));
        //list1.remove(s15);
        //System.out.println("Is the Student record removed ?" +list1.get(5));

        System.out.println(list1.get(0));
        System.out.println(list1.get(size-1));

        List<Student> list2 = new ArrayList<>();


        Student s7= new Student(207, "Satwik");
        Student s8= new Student(208, "Sudha", "Second");

        list2.add(s7);
        list2.add(s8);

        list1.addAll(1,list2);

        list1.clear();
        list2.clear();
        System.out.println("Size of list1 is: "+list1.size()+" and list2 is: "+ list2.size());


        Set<Student> set = new HashSet<>();


        Student s35= new Student(305, "Rakhee");
        Student s38= new Student(308, "Richi","Third");
        Student s39= new Student(308, "Rishi","Third");

        set.add(s35);
        set.add(s38);
        set.add(s39);

        System.out.println("Size of the set: "+set.size());
        System.out.println(set);





    }

}

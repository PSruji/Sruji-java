
import java.util.*;
import java.util.function.Predicate;

public class Test {

    public static void main(String args[]){

        String str = new String();
        Student s1 = new Student(1, "sateesh");
        Student s2 = new Student(2, "srujana");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);


        Student s3 = new Student(2, "srujana");
        System.out.println(list.contains(s3));
        System.out.println(set.contains(s3));

        System.out.println();
        List<String> list1 = new ArrayList<>();
        Set<String> set1 = new HashSet<>();
        list1.add("sateesh");
        list1.add("srujana");

        set1.add("sateesh");
        set1.add("srujana");

        String search = "sateesh";
        System.out.println(list1.contains(search));
        System.out.println(set1.contains(search));






    }
}
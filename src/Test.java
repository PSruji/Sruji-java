
import java.util.*;
import java.util.function.Predicate;

public class Test {

    public static void main(String args[]) {

        String str = new String();
        Student s1 = new Student(1, "sateesh", "1");
        Student s2 = new Student(2, "srujana", "2");
        Student s3 = new Student(3, "Anu", "2");


        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);


        Student s4 = new Student(2, "srujana");
        System.out.println(list.contains(s4));
        System.out.println(set.contains(s4));

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
        System.out.println(set);


        // Loops usage Demo

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        int i;

        for (i = 0; i < list2.size(); i++) {
            if ((list2.get(i)) % 2 == 0)
                System.out.println("The Element at location " + (i) + " is even");
            else
                System.out.println("The Element at location " + (i) + " is Odd");

        }
    }
}
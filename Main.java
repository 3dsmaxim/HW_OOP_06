import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Student s5 = new Student(2, new UserFirsName("Zack"), new UserSecondName("Kovrov"),
                new UserPatronymic("Petrovich"));
        Student s1 = new Student(3, new UserFirsName("Wack"), new UserSecondName("Zuba"),
                new UserPatronymic("Ivanovich"));
        AngryStudent s2 = new AngryStudent(1, new UserFirsName("Pettr"), "aaaaa");
        AngryStudent s3 = new AngryStudent(0, new UserFirsName("Aet"), "AAAAA");
        List<Student> treeSet = new ArrayList<>();

        treeSet.add(s5);//грузится только в Student
        treeSet.add(s1);//грузится только в Student
        treeSet.add(s2);//грузится только и в Student, и в AngryStudent ---дочка  (типа наверно "D")
        treeSet.add(s3);//грузится только и в Student, и в AngryStudent ---дочка

        for (var b : treeSet) {
            System.out.println(b);
        }
        System.out.println("--------------------");
        Iterator<Student> studentIterator = treeSet.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        TreeSet<Student> tree = new TreeSet<Student>(new StudentComparator<>());
        tree.add(s5);
        tree.add(s2);
        tree.add(s1);
        tree.add(s3);
        System.out.println("--------------------");

        for (var b : tree) {
            System.out.println(b);
        }

    }

}
import java.util.Comparator;

public class StudentComparator<T extends Student> implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        
           int resultOfComparing = o1.firstName.getFirstName().compareTo(o2.firstName.getFirstName());
            if (resultOfComparing == 0) {
                return o1.patronymic.getPatronymic().compareTo(o2.patronymic.getPatronymic());
            } else {
                return resultOfComparing;
            }
    }
}
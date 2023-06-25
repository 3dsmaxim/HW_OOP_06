
public class Student implements Comparable<Student> {
    //Сдесь собрал все и добавил перегрузку (типа Это "O", но это не точно)

    private long studentId;
    
    UserFirsName firstName; 
    UserSecondName secondName;
    UserPatronymic patronymic;

    public Student(long studentId, UserFirsName firstName, UserSecondName secondName, UserPatronymic patronymic) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public Student(long studentId, UserFirsName firstName) {
        this.studentId = studentId;
        this.firstName = firstName;

    }

    public Student() {

    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                firstName + '\'' +
                secondName + '\'' +
                patronymic + '\'' +
                '}';
    }

    // @Override
    // public int compareTo(Student o) {
    // return this.studentId.compareTo(o.studentId);
    // }   Как поправить так и не понял

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
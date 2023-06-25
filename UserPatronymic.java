
//Разделил на более мелкие детали(типа одна ответственность"S")
public class UserPatronymic {

    private String patronymic;

    public UserPatronymic() {

    }

    public UserPatronymic(String patronymic) {

        this.patronymic = patronymic;

    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Patronymic='" + patronymic;
    }

    

}
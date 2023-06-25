import java.time.LocalDate;

//Разделил на более мелкие детали,  висит просто так так как неработает, знаний поче нет

public class UserLocalDate {

    private LocalDate dateOfBirth;

    public UserLocalDate() {

    }

    public UserLocalDate(LocalDate dateOfBirth) {
        
        this.dateOfBirth = dateOfBirth;
    }

   

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "DateOfBirth=" + dateOfBirth;
    }



}

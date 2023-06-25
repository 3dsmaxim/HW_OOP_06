
//Разделил на более мелкие детали (типа одна ответственность"S")
public class UserFirsName {
  


    private String firstName;
    

    public UserFirsName() {
        
    }

    public UserFirsName(String firstName) {
        this.firstName = firstName;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    @Override
    public String toString() {
        return "firstName='" + firstName;
    }

}
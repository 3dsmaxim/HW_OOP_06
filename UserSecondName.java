//Разделил на более мелкие детали(типа одна ответственность"S")

public class UserSecondName {
   
    private String secondName;
    

    public UserSecondName() {
        
    }

    public UserSecondName(String secondName) {
        
        this.secondName = secondName;
        
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    
    @Override
    public String toString() {
        return "SecondName='" + secondName;
    }

}

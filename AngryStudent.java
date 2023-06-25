
// тут типо класс с поведением родительского класса
public class AngryStudent extends Student {

    private String voiceHnyk;
    

    public AngryStudent(long studentId, UserFirsName firstName, String voiceHnyk) {
        super(studentId, firstName);
        this.voiceHnyk = voiceHnyk;
    }

    public String getVoiceHnyk() {
        return voiceHnyk;
    }

    public void setVoiceHnyk(String voiceHnyk) {
        this.voiceHnyk = voiceHnyk;
    }

    @Override
    public String toString() {
        return "Angry Student{" +
                "studentId='" + super.getStudentId() + '\'' +
                super.firstName + '\'' +
                "Voice ---" + voiceHnyk + '\'' +
                '}';
    }

}

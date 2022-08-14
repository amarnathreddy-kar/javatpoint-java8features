package streamapi;

public class Student {

    private String sName;
    private int sId;
    private char grade;

    public Student(String sName, int sId, char grade) {
        this.sName = sName;
        this.sId = sId;
        this.grade = grade;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sId=" + sId +
                ", grade=" + grade +
                '}';
    }
}

package Students;


import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Student {

    //declarations

    private String name = "Peter";
    private int age;
    private String subject;
    private boolean isPresent;

    //constructors

    public Student(){
    }

    public Student(String name,int age, String subject,boolean isPresent){
        this.name=name;
        this.age = age;
        this.subject = subject;
        this.isPresent = isPresent;
    }


}

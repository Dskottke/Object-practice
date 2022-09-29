package Students;

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


    //Methods

    @Override
    public String toString(){

        return name + "\n" + age + "\n" + subject + "\n"+ isPresent+ "\n";
    }

    //getter and setter - methods

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Student {
    String name;
    int age;
    int id_card;
    boolean isValid;
    int semester_number;
    double average_grade;
    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void displayName(){
        System.out.println("Your name is "+name);
    }
    void displayAge(){
        System.out.println("You are "+age +"years old");
    }
    void displayInfo(){
        System.out.println("Student "+name+" has an average grade of "+average_grade+" while studying on the "+semester_number+" semester");
    }
    void setValidity(boolean flag){
        isValid=flag;
    }
    void studentIdInfo(){
        System.out.println("Student "+name+" has an id card with numvber: "+id_card+((isValid) ?" which is still valid":" which is not valid already"));
    }

}

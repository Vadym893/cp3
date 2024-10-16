public class StudentTest {
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.id_card=651235163;

        s.average_grade=3.4;
        s.semester_number=3;
        System.out.println(s.name + " " + s.age);
        s.sayHello();
        s.displayAge();
        s.displayName();
        s.setValidity(false);
        s.displayInfo();
        s.studentIdInfo();
    }
}

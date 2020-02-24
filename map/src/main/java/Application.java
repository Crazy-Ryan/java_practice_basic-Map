import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Map<Student, Integer> studentList = new HashMap<>();
        studentList.put(new Student("Linda", 18), 18);
        studentList.put(new Student("Cindy", 19), 19);
        studentList.put(new Student("Mary", 19), 19);
        Teacher bob = new Teacher("Bob", studentList);
        bob.addStudent(new Student("Ben", 19))
                .addStudent(new Student("Solider", 20));
        System.out.println("All student list: ");
        bob.printStudentList();

    }

}

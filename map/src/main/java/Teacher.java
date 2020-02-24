import java.util.HashMap;
import java.util.Map;

public class Teacher {

    private String name;
    private Map<Student, Integer> studentList;

    public Teacher(String name) {
        this.name = name;
        studentList = new HashMap<>();
    }

    public Teacher(String name, Map<Student, Integer> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public Teacher addStudent(Student newStudent) {
        studentList.put(newStudent, newStudent.getAge());
        return this;
    }

    public void printStudentList() {
        for (Map.Entry<Student, Integer> student : studentList.entrySet()) {
            System.out.println(student.getKey().toString());
        }
    }

}

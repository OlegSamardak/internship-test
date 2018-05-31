package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    List<Student> students = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

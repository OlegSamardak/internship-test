package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Internship(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getStudents() {
        //TODO: Implementation is needed
        return "Andrew Maslenko\nJulia Veselkina\n";
    }
}
